package Logbook.Week5;

public class Task1 {

    // Product.java (within Logbook.Week5 package)
    public static class Product {
        private final String productId;
        private final String name;
        private final double price;
        private int quantity;

        public Product(String productId, String name, double price, int quantity) {
            this.productId = productId;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "productId='" + productId + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    '}';
        }
    }

    // StockList.java (within Logbook.Week5 package)
    public static class StockList {
        private final java.util.HashMap<String, Product> stock;

        public StockList() {
            this.stock = new java.util.HashMap<>();
        }

        public void addStock(Product product) {
            if (product != null) {
                String productId = product.getProductId();
                if (stock.containsKey(productId)) {
                    Product existingProduct = stock.get(productId);
                    existingProduct.setQuantity(existingProduct.getQuantity() + product.getQuantity());
                } else {
                    stock.put(productId, product);
                }
            }
        }

        public Product getProduct(String productId) {
            return stock.get(productId);
        }

        public void sellStock(String productId, int quantity) {
            Product product = stock.get(productId);
            if (product != null && product.getQuantity() >= quantity) {
                product.setQuantity(product.getQuantity() - quantity);
            } else {
                System.out.println("Insufficient stock for product: " + productId);
            }
        }

        public void printStock() {
            System.out.println("Stock List:");
            for (Product product : stock.values()) {
                System.out.println(product);
            }
        }
    }

    // StockDemo.java (within Logbook.Week5 package)
    public static class StockDemo {
        public static void main(String[] args) { // Corrected main method signature
            StockList stockList = new StockList();

            Product product1 = new Product("P001", "Laptop", 1200.0, 10);
            Product product2 = new Product("P002", "Mouse", 25.0, 50);
            Product product3 = new Product("P001", "Laptop", 1200.0, 5); // Add more of product1

            stockList.addStock(product1);
            stockList.addStock(product2);
            stockList.addStock(product3);

            stockList.printStock();

            stockList.sellStock("P002", 20);
            stockList.sellStock("P001", 12);
            stockList.sellStock("P003", 1); //non existent product

            stockList.printStock();

            Product retrievedProduct = stockList.getProduct("P001");
            if(retrievedProduct != null){
                System.out.println("Retrieved product: " + retrievedProduct);
            } else {
                System.out.println("Product not found");
            }
        }
    }
}
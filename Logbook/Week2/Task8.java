package Logbook.Week2;

public class Task8 {
    public static void main(String[] args) {

        System.out.println("Even numbers from 1 to 10:");

        // Method 1: Using the modulo operator (%)
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // If the remainder when divided by 2 is 0, it's even
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Newline for better formatting


        // Method 2: Incrementing by 2 (more efficient)
        System.out.println("\nEven numbers from 1 to 10 (Method 2):");
        for (int i = 2; i <= 10; i += 2) { // Start at 2 and increment by 2
            System.out.print(i + " ");
        }
        System.out.println();


        //Method 3: while loop and modulo
        System.out.println("\nEven numbers from 1 to 10 (Method 3):");

        int i = 1;
        while(i<=10){
            if(i%2==0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}
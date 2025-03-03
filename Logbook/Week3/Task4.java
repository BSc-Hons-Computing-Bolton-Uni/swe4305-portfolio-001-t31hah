package Logbook.Week3;

public class Task4 {

    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void print() {
            System.out.println("Student ID: " + id + ", Name: " + name);
        }

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        // Instantiate a Student object
        Student myStudent = new Student(100162245, "Firstname"); // Replace with your actual name and ID

        // You can now use the myStudent object
        myStudent.print();
        System.out.println(myStudent); // Uses toString()
    }
}
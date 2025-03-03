package Logbook.Week3;

public class Task3 {

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

    public static void main(String[] args) { // Corrected main method parameter
        Student student1 = new Student(201, "Talhah Khan");
        Student student2 = new Student(202, "Andrew Van David");

        student1.print();
        student2.print();

        System.out.println(student1);
        System.out.println(student2);
    }
}
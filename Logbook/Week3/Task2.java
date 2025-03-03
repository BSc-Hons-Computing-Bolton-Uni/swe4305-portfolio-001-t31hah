package Logbook.Week3;

public class Task2 {

    public static class Student { // Make Student static
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

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, "John Barry");
        Student student2 = new Student(102, "Jack Smith");

        System.out.println(student1);
        System.out.println(student2);
    }
}
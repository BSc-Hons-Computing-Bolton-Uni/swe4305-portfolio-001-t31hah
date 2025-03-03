package Logbook.Week3;

public class Task6 {

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
        // Student object
        Student myStudent = new Student(87654321, "TestName"); // Replace with suitable values

        // Test that the values have been passed and assigned correctly
        System.out.println("Testing value assignment:");
        myStudent.print(); // Call the print method to verify the values

        // Also you can also check the values directly:
        System.out.println("Direct ID check: " + (myStudent.getId() == 87654321));
        System.out.println("Direct Name check: " + myStudent.getName().equals("TestName"));
    }

    // New Course class
    public static class Course {
        private String code;
        private String name;

        public Course(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Course [code=" + code + ", name=" + name + "]";
        }
    }
}
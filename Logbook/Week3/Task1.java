package Logbook.Week3;

public class Task1 {
    public class Student {
        private int id;
        private String name;

        // Constructor
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Getters and setters
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

        // toString method for easy printing
        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + "]";
        }
    }
}

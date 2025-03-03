package Logbook.Week3;

public class Task10 {

    public static class Student {
        private int id;
        private String name;
        private Course course; // Added Course attribute

        public Student(int id, String name) { // Simplified student creation.
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

        public Course getCourse() {
            return course;
        }

        public void setCourse(Course course) {
            this.course = course;
        }

        public void enrol(Course course){ //enrol method added.
            this.course = course;
        }

        public void print() {
            System.out.println("Student ID: " + id + ", Name: " + name);
            if(course != null){
                System.out.println("Enrolled in:");
                course.print(); // Call the print method of the Course object
            } else {
                System.out.println("Not enrolled in any course.");
            }
        }

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
        }
    }

    public static void main(String[] args) {
        // Course object
        Course myCourse = new Course("CS101", "Intro to Programming");
        Course myCourse2 = new Course("Math201", "Advanced Math");

        // Student object
        Student myStudent = new Student(87654321, "TestName"); // Simplified student creation
        myStudent.enrol(myCourse);

        // Test that the values have been passed and assigned correctly
        System.out.println("Testing value assignment:");
        myStudent.print(); // Call the print method to verify the values

        // Also you can also check the values directly:
        System.out.println("Direct ID check: " + (myStudent.getId() == 87654321));
        System.out.println("Direct Name check: " + myStudent.getName().equals("TestName"));
        System.out.println("Direct Course check: " + myStudent.getCourse().equals(myCourse));

        myStudent.enrol(myCourse2);
        System.out.println("\nTesting Re-enrolment:");
        myStudent.print();

        System.out.println("\nTesting Course:");
        myCourse.print();

        Student studentWithoutCourse = new Student(100162245, "NoCourseStudent");
        System.out.println("\nTesting Student with no course:");
        studentWithoutCourse.print();
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

        public void print() {
            System.out.println("Course Code: " + code + ", Course Name: " + name);
        }

        @Override
        public String toString() {
            return "Course [code=" + code + ", name=" + name + "]";
        }
    }
}
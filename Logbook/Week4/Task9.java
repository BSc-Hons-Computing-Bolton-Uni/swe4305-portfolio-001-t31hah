package Logbook.Week4;

import java.util.ArrayList;
import java.util.Random;

public class Task9 {

    public enum Grade {
        A, B, C, D, F
    }

    public static class Student {
        private int id;
        private String name;
        private Course course;
        private int[] marks;

        public Student(int id, String name, Course course) {
            this.id = id;
            this.name = name;
            this.course = course;
            this.marks = new int[4];

            if (course != null) {
                for (int i = 0; i < 4; i++) {
                    this.marks[i] = generateRandomMark();
                }
            }
        }

        private int generateRandomMark() {
            Random random = new Random();
            return random.nextInt(101);
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

        public void enrol(Course course) {
            this.course = course;
        }

        public int[] getMarks() {
            return marks;
        }

        public void setMarks(int[] marks) {
            this.marks = marks;
        }

        public void setMark(int index, int mark) {
            if (index >= 0 && index < 4 && mark >= 0 && mark <= 100) {
                this.marks[index] = mark;
            } else {
                System.out.println("Invalid index or mark value.");
            }
        }

        public void print() {
            System.out.println("Student ID: " + id + ", Name: " + name);
            if (course != null) {
                System.out.println("Enrolled in:");
                System.out.println("Course Code: " + course.getCode() + ", Course Name: " + course.getName());
                System.out.println("Modules and Marks:");
                ArrayList<Module> modules = course.getModules();
                for (int i = 0; i < modules.size(); i++) {
                    Module module = modules.get(i);
                    System.out.println("  Module Code: " + module.getCode() + ", Module Name: " + module.getName() + ", Mark: " + marks[i] + ", Grade: " + module.getLetterGrade(marks[i]));
                }
            } else {
                System.out.println("Not enrolled in any course.");
            }
        }

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + java.util.Arrays.toString(marks) + "]";
        }
    }

    public static class Course {
        private String code;
        private String name;
        private ArrayList<Module> modules;

        public Course(String code, String name) {
            this.code = code;
            this.name = name;
            this.modules = new ArrayList<>();

            modules.add(new Module("Introduction to Programming", "PROG101"));
            modules.add(new Module("Data Structures", "DS201"));
            modules.add(new Module("Algorithms", "ALG301"));
            modules.add(new Module("Software Engineering", "SE401"));
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

        public ArrayList<Module> getModules() {
            return modules;
        }

        public void print() {
            System.out.println("Course Code: " + code + ", Course Name: " + name);
            System.out.println("Modules:");
            for (Module module : modules) {
                module.print();
            }
        }

        @Override
        public String toString() {
            return "Course [code=" + code + ", name=" + name + ", modules=" + modules + "]";
        }
    }

    public static class Module {
        private String name;
        private String code;

        public Module(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void print() {
            System.out.println("  Module Code: " + code + ", Module Name: " + name);
        }

        public Grade getLetterGrade(int mark) {
            if (mark >= 90) {
                return Grade.A;
            } else if (mark >= 80) {
                return Grade.B;
            } else if (mark >= 70) {
                return Grade.C;
            } else if (mark >= 60) {
                return Grade.D;
            } else {
                return Grade.F;
            }
        }

        @Override
        public String toString() {
            return "Module [code=" + code + ", name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        // Test: Instantiate Course class
        Course myActualCourse = new Course("COMP101", "Introduction to Computer Science");

        // Student object
        Student myStudent = new Student(87654321, "TestName", myActualCourse);

        // Verify enrollment
        System.out.println("Testing Course Enrollment:");
        myStudent.print();

        // Optional: Additional tests
        System.out.println("\nTesting value assignment:");
        System.out.println("Direct ID check: " + (myStudent.getId() == 87654321));
        System.out.println("Direct Name check: " + myStudent.getName().equals("TestName"));
        System.out.println("Direct Course check: " + myStudent.getCourse().equals(myActualCourse));

        System.out.println("\nTesting Course:");
        myActualCourse.print();

        Student studentWithoutCourse = new Student(11111111, "NoCourseStudent", null);
        System.out.println("\nTesting Student with no course:");
        studentWithoutCourse.print();

        // Test: Instantiate Module class
        Module myModule = new Module("Object Oriented Programming", "OOP201");
        System.out.println("\nTesting Module:");
        myModule.print();
    }
}
package Logbook.Week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task10 {

    public enum Grade {
        A, B, C, D, F
    }

    public static class Student {
        private int id;
        private String name;
        private Course course;

        public Student(int id, String name, Course course) {
            this.id = id;
            this.name = name;
            this.course = course;
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

        public void print() {
            System.out.println("Student ID: " + id + ", Name: " + name);
            if (course != null) {
                System.out.println("Enrolled in:");
                System.out.println("Course Code: " + course.getCode() + ", Course Name: " + course.getName());
                System.out.println("Modules and Marks:");
            } else {
                System.out.println("Not enrolled in any course.");
            }
        }

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
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

    public static class ModuleMark {
        private Student student;
        private Module module;
        private int mark;

        public ModuleMark(Student student, Module module, int mark) {
            this.student = student;
            this.module = module;
            this.mark = mark;
        }

        public Student getStudent() {
            return student;
        }

        public Module getModule() {
            return module;
        }

        public int getMark() {
            return mark;
        }

        public Grade getGrade() {
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

        public void printModuleMark() {
            System.out.println("  Student: " + student.getName() + ", Module: " + module.getName() + ", Mark: " + mark + ", Grade: " + getGrade());
        }
    }

    public static void main(String[] args) {
        Course myActualCourse = new Course("COMP101", "Introduction to Computer Science");

        List<Student> students = new ArrayList<>();
        students.add(new Student(12345678, "Alice", myActualCourse));
        students.add(new Student(87654321, "Bob", myActualCourse));
        students.add(new Student(98765432, "Charlie", myActualCourse));

        Random random = new Random();
        List<ModuleMark> moduleMarks = new ArrayList<>();

        for (Student student : students) {
            for (Module module : myActualCourse.getModules()) {
                int mark = random.nextInt(101);
                moduleMarks.add(new ModuleMark(student, module, mark));
            }
        }

        for (Student student : students) {
            student.print();
            for (ModuleMark mark : moduleMarks) {
                if (mark.getStudent().equals(student)) {
                    mark.printModuleMark();
                }
            }
        }
    }
}
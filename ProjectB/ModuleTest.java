package ProjectB;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {

    @Test
    void testAddStudent() {
        Module module = new Module(101, "Test Module");
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        module.addStudent(student1);
        module.addStudent(student2);
        List<Student> students = module.getStudents();
        assertEquals(2, students.size());
        assertEquals(student1, students.get(0));
        assertEquals(student2, students.get(1));
    }

    @Test
    void testGetModuleCode() {
        Module module = new Module(101, "Test Module");
        assertEquals(101, module.getModuleCode());
    }

    @Test
    void testGetModuleName() {
        Module module = new Module(101, "Test Module");
        assertEquals("Test Module", module.getModuleName());
    }

    @Test
    void testCalculateStatsNoStudents() {
        Module module = new Module(101, "Test Module");
        // This test checks that calculateStats doesn't throw an exception
        // when there are no students.  It's difficult to assert the
        // output of System.out.println, so we just check for no error.
        module.calculateStats();
    }

    @Test
    void testCalculateStatsWithStudents() {
        Module module = new Module(101, "Test Module");
        Student student1 = new Student(1, "Alice");
        student1.addMark(new Mark(80));
        student1.addMark(new Mark(70));
        Student student2 = new Student(2, "Bob");
        student2.addMark(new Mark(60));
        student2.addMark(new Mark(50));
        module.addStudent(student1);
        module.addStudent(student2);

        // Redirect System.out to a StringBuilder to capture output
        StringBuilder capturedOutput = new StringBuilder();
        System.setOut(new java.io.PrintStream(new java.io.OutputStream() {
            public void write(int b) {
                capturedOutput.append((char) b);
            }
        }));

        module.calculateStats();

        // Restore standard output
        System.setOut(System.out);

        String expectedOutput = "Module: Test Module\n" +
                "Mean Mark: 65.0\n" +
                "Max Mark: 80\n" +
                "Min Mark: 50\n";
        assertEquals(expectedOutput, capturedOutput.toString());
    }
}

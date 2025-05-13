package ProjectB;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    // Add this setter to your Solution class:
    public static void setModules(List<Module> modules) {
        Solution.modules = modules;
    }

    @Test
    void testFindModuleByCode_ModuleExists() {
        // Create a list of modules for testing
        List<Module> modules = new ArrayList<>();
        Module module1 = new Module(101, "Math");
        Module module2 = new Module(102, "Science");
        modules.add(module1);
        modules.add(module2);

        // Assuming findModuleByCode is a static method in Solution
        Solution.setModules(modules); // Use the setter here
        Module foundModule = Solution.findModuleByCode(101);
        assertEquals(module1, foundModule);
    }

    @Test
    void testFindModuleByCode_ModuleDoesNotExist() {
        // Create a list of modules for testing
        List<Module> modules = new ArrayList<>();
        Module module1 = new Module(101, "Math");
        Module module2 = new Module(102, "Science");
        modules.add(module1);
        modules.add(module2);

        // Use a method from Solution
        Solution.setModules(modules); // Use the setter here

        Module foundModule = Solution.findModuleByCode(103);
        assertNull(foundModule);
    }

    @Test
    void testFindStudentById_StudentExists() {
        // Create a module and add students to it
        Module module = new Module(101, "Math");
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        module.addStudent(student1);
        module.addStudent(student2);

        // Use a method from Solution
        Student foundStudent = Solution.findStudentById(module, 1);
        assertEquals(student1, foundStudent);
    }

    @Test
    void testFindStudentById_StudentDoesNotExist() {
        // Create a module and add students to it
        Module module = new Module(101, "Math");
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        module.addStudent(student1);
        module.addStudent(student2);

        // Use a method from Solution
        Student foundStudent = Solution.findStudentById(module, 3);
        assertNull(foundStudent);
    }

    // Helper method to simulate user input (for testing methods that use Scanner)
    private static void provideInput(String data) {
        InputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }
}

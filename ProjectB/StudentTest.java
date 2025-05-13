package ProjectB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;
    private final int TEST_ID = 12345;
    private final String TEST_NAME = "John Doe";

    @BeforeEach
    void setUp() {
        // Create a new student instance before each test
        student = new Student(TEST_ID, TEST_NAME);
    }

    @Test
    void testStudentConstructor() {
        // Verify the student ID was correctly assigned
        assertEquals(TEST_ID, student.getStudentId(),
                "Student ID should match the value provided in constructor");

        // Verify the student name was correctly assigned
        assertEquals(TEST_NAME, student.getName(),
                "Student name should match the value provided in constructor");
    }

    @Test
    void testGetStudentId() {
        // Verify student ID getter works correctly
        assertEquals(TEST_ID, student.getStudentId(),
                "getStudentId() should return the correct student ID");

        // Create a different student with a different ID to test
        Student anotherStudent = new Student(54321, "Jane Doe");
        assertEquals(54321, anotherStudent.getStudentId(),
                "getStudentId() should return the unique ID for each student");
    }

    @Test
    void testGetName() {
        // Verify name getter works correctly
        assertEquals(TEST_NAME, student.getName(),
                "getName() should return the correct student name");

        // Create a different student with a different name to test
        Student anotherStudent = new Student(54321, "Jane Doe");
        assertEquals("Jane Doe", anotherStudent.getName(),
                "getName() should return the correct name for each student");
    }

    @Test
    void testAddAndGetMarks() {
        // Initial marks list should be empty
        assertTrue(student.getMarks().isEmpty(),
                "Initial marks list should be empty");

        // Add a mark and verify it was added
        Mark mark1 = new Mark(75);
        student.addMark(mark1);
        assertEquals(1, student.getMarks().size(),
                "Marks list should have one element after adding a mark");
        assertEquals(75, student.getMarks().get(0).getMarkValue(),
                "The mark value should match what was added");

        // Add another mark and verify both marks are present
        Mark mark2 = new Mark(60);
        student.addMark(mark2);
        assertEquals(2, student.getMarks().size(),
                "Marks list should have two elements after adding two marks");
        assertEquals(75, student.getMarks().get(0).getMarkValue(),
                "First mark value should be preserved");
        assertEquals(60, student.getMarks().get(1).getMarkValue(),
                "Second mark value should match what was added");
    }

    @Test
    void testGetGradeForModule() {
        // Add marks for different grades
        student.addMark(new Mark(90)); // Grade A
        student.addMark(new Mark(65)); // Grade B
        student.addMark(new Mark(55)); // Grade C
        student.addMark(new Mark(45)); // Grade D
        student.addMark(new Mark(35)); // Grade F

        // Test grade calculation for each mark
        assertEquals(Grade.A, student.getGradeForModule(0),
                "Mark of 90 should result in Grade A");
        assertEquals(Grade.B, student.getGradeForModule(1),
                "Mark of 65 should result in Grade B");
        assertEquals(Grade.C, student.getGradeForModule(2),
                "Mark of 55 should result in Grade C");
        assertEquals(Grade.D, student.getGradeForModule(3),
                "Mark of 45 should result in Grade D");
        assertEquals(Grade.F, student.getGradeForModule(4),
                "Mark of 35 should result in Grade F");
    }

    @Test
    void testGetGradeForInvalidModuleIndex() {
        // Test for invalid index when no marks exist
        assertNull(student.getGradeForModule(-1),
                "Negative index should return null");
        assertNull(student.getGradeForModule(0),
                "Index 0 should return null when no marks exist");

        // Add a mark and test again
        student.addMark(new Mark(70));
        assertNull(student.getGradeForModule(-1),
                "Negative index should still return null");
        assertEquals(Grade.A, student.getGradeForModule(0),
                "Valid index should return correct grade");
        assertNull(student.getGradeForModule(1),
                "Out of bounds index should return null");
    }
}
package ProjectB;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MarkTest {

    @Test
    void testValidMark() {
        Mark mark = new Mark(50);
        assertEquals(50, mark.getMarkValue());
    }

    @Test
    void testInvalidMarkTooLow() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Mark(-10);
        });
        assertEquals("Mark must be between 0 and 100.", exception.getMessage());
    }

    @Test
    void testInvalidMarkTooHigh() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Mark(110);
        });
        assertEquals("Mark must be between 0 and 100.", exception.getMessage());
    }

    @Test
    void testCalculateGradeA() {
        Mark mark = new Mark(75);
        assertEquals(Grade.A, mark.calculateGrade());
    }

    @Test
    void testCalculateGradeB() {
        Mark mark = new Mark(65);
        assertEquals(Grade.B, mark.calculateGrade());
    }

    @Test
    void testCalculateGradeC() {
        Mark mark = new Mark(55);
        assertEquals(Grade.C, mark.calculateGrade());
    }

    @Test
    void testCalculateGradeD() {
        Mark mark = new Mark(45);
        assertEquals(Grade.D, mark.calculateGrade());
    }

    @Test
    void testCalculateGradeF() {
        Mark mark = new Mark(35);
        assertEquals(Grade.F, mark.calculateGrade());
    }

    @Test
    void testBoundaryMark0() {
        Mark mark = new Mark(0);
        assertEquals(Grade.F, mark.calculateGrade());
    }

    @Test
    void testBoundaryMark40() {
        Mark mark = new Mark(40);
        assertEquals(Grade.D, mark.calculateGrade());
    }

    @Test
    void testBoundaryMark50() {
        Mark mark = new Mark(50);
        assertEquals(Grade.C, mark.calculateGrade());
    }

    @Test
    void testBoundaryMark60() {
        Mark mark = new Mark(60);
        assertEquals(Grade.B, mark.calculateGrade());
    }

    @Test
    void testBoundaryMark70() {
        Mark mark = new Mark(70);
        assertEquals(Grade.A, mark.calculateGrade());
    }


    @Test
    void testBoundaryMark100() {
        Mark mark = new Mark(100);
        assertEquals(Grade.A, mark.calculateGrade());
    }
}

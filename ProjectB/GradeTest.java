package ProjectB;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    @Test
    void testGetClassificationA() {
        assertEquals("First Class", Grade.A.getClassification());
    }

    @Test
    void testGetClassificationB() {
        assertEquals("Upper Second Class", Grade.B.getClassification());
    }

    @Test
    void testGetClassificationC() {
        assertEquals("Lower Second Class", Grade.C.getClassification());
    }

    @Test
    void testGetClassificationD() {
        assertEquals("Third Class", Grade.D.getClassification());
    }

    @Test
    void testGetClassificationF() {
        assertEquals("Fail", Grade.F.getClassification());
    }
}

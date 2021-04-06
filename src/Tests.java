import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void equilateralTest() {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            assertEquals(TriangleType.EQUILATERAL_TRIANGLE, TriangleChecker.checkTriangle(i, i, i));
        }
    }

    @Test
    public void noTriangleTest() {
        for (int i = 1; i < 10; i++) {
            assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(i * 3, i, i));
            assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(i, i * 3, i));
            assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(i, i, i * 3));
        }
    }
}

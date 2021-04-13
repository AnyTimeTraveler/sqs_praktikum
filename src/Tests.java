import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class Tests {

    @Test // gleichseitig
    public void own_equilateralTest() {
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(1, 1, 1));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE,
                TriangleCheckerOwn.checkTriangle(894456684, 894456684, 894456684));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE,
                TriangleCheckerOwn.checkTriangle(378710059, 378710059, 378710059));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE,
                TriangleCheckerOwn.checkTriangle(594244357, 594244357, 594244357));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE,
                TriangleCheckerOwn.checkTriangle(25880563, 25880563, 25880563));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE,
                TriangleChecker.checkTriangle(2147483647, 2147483647, 2147483647));
    }

    @Test // ungleichseitig
    public void own_scaleneTestOwn() {
        assertEquals(TriangleType.SCALENE_TRIANGLE, TriangleCheckerOwn.checkTriangle(4, 7, 5));
        assertEquals(TriangleType.SCALENE_TRIANGLE, TriangleCheckerOwn.checkTriangle(8, 4, 7));
        assertEquals(TriangleType.SCALENE_TRIANGLE, TriangleCheckerOwn.checkTriangle(2, 6, 7));
    }

    @Test // gleichschenklig
    public void own_isocleseTestOwn() {
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(2, 2, 3));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(3, 3, 5));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(4, 4, 6));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(3, 2, 2));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(3, 4, 3));
    }

    @Test // gleichseitig
    public void own_noTriangleTestOwn() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(-2, 4, 2));
        assertEquals(TriangleType.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(1, 2, 3));
        assertEquals(TriangleType.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(0, 0, 2));
        assertEquals(TriangleType.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(2, 4, 2));
        assertEquals(TriangleType.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(0, 0, 0));
        assertEquals(TriangleType.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(0, 2, 0));
        assertEquals(TriangleType.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(2, 0, 0));
    }

    @Test //gleichseitig
    public void streek_cequilateralTest() {
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE, TriangleChecker.checkTriangle(1, 1, 1));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE,
                TriangleChecker.checkTriangle(894456684, 894456684, 894456684));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE,
                TriangleChecker.checkTriangle(378710059, 378710059, 378710059));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE,
                TriangleChecker.checkTriangle(594244357, 594244357, 594244357));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE,
                TriangleChecker.checkTriangle(25880563, 25880563, 25880563));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE,
                TriangleChecker.checkTriangle(2147483647, 2147483647, 2147483647));
    }

    @Test // ungleichseitig
    public void streek_scaleneTest() {
        assertEquals(TriangleType.SCALENE_TRIANGLE, TriangleChecker.checkTriangle(4, 7, 5));
        assertEquals(TriangleType.SCALENE_TRIANGLE, TriangleChecker.checkTriangle(8, 4, 7));
        assertEquals(TriangleType.SCALENE_TRIANGLE, TriangleChecker.checkTriangle(2, 6, 7));
    }

    @Test // gleichschenklig
    public void streek_isocleseTest() {
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleChecker.checkTriangle(2, 2, 3));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleChecker.checkTriangle(3, 3, 5));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleChecker.checkTriangle(4, 4, 6));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleChecker.checkTriangle(3, 2, 2));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleChecker.checkTriangle(3, 4, 3));
    }

    //split up for easy checking
    @Test
    public void streek_noTriangleTestNegativNumber() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(-2, 4, 2));
    }

    @Test
    public void streek_noTriangleTestABCEqual() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(1, 2, 3));
    }

    @Test
    public void streek_noTriangleTestFirstZero() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(0, 2, 2));
    }

    @Test
    public void streek_noTriangleTestFirstTwoZero() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(0, 0, 2));
    }

    @Test
    public void streek_noTriangleTestAllZero() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(0, 0, 0));
    }

    @Test
    public void streek_noTriangleTestFirstLastZero() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(0, 2, 0));
    }

    @Test
    public void streek_noTriangleTestLastTwoZero() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(2, 0, 0));
    }
}

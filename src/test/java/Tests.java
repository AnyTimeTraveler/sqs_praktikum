import org.hsemden.sqs.aufgabe3.TriangleCheckerOwn;
import org.hsemden.sqs.aufgabe3.TriangleTypeOwn;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test // gleichseitig
    public void ownEquilateralTest() {
        assertEquals(TriangleTypeOwn.EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(1, 1, 1));
        assertEquals(TriangleTypeOwn.EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(894456684, 894456684, 894456684));
        assertEquals(TriangleTypeOwn.EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(378710059, 378710059, 378710059));
        assertEquals(TriangleTypeOwn.EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(594244357, 594244357, 594244357));
        assertEquals(TriangleTypeOwn.EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(25880563, 25880563, 25880563));
        assertEquals(TriangleTypeOwn.EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(2147483647, 2147483647, 2147483647));
    }

    @Test // ungleichseitig
    public void ownScaleneTestOwn() {
        assertEquals(TriangleTypeOwn.SCALENE_TRIANGLE, TriangleCheckerOwn.checkTriangle(4, 7, 5));
        assertEquals(TriangleTypeOwn.SCALENE_TRIANGLE, TriangleCheckerOwn.checkTriangle(8, 4, 7));
        assertEquals(TriangleTypeOwn.SCALENE_TRIANGLE, TriangleCheckerOwn.checkTriangle(2, 6, 7));
    }

    @Test // gleichschenklig
    public void ownIsocleseTestOwn() {
        assertEquals(TriangleTypeOwn.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(2, 2, 3));
        assertEquals(TriangleTypeOwn.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(3, 3, 5));
        assertEquals(TriangleTypeOwn.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(4, 4, 6));
        assertEquals(TriangleTypeOwn.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(3, 2, 2));
        assertEquals(TriangleTypeOwn.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(3, 4, 3));
        assertEquals(TriangleTypeOwn.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(4, 4, 3));
    }

    @Test // gleichseitig
    public void ownNoTriangleTestOwn() {
        assertEquals(TriangleTypeOwn.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(-2, 4, 2));
        assertEquals(TriangleTypeOwn.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(1, 2, 3));
        assertEquals(TriangleTypeOwn.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(0, 0, 2));
        assertEquals(TriangleTypeOwn.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(2, 4, 2));
        assertEquals(TriangleTypeOwn.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(0, 0, 0));
        assertEquals(TriangleTypeOwn.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(0, 2, 0));
        assertEquals(TriangleTypeOwn.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(2, 0, 0));
    }

    @Test //gleichseitig
    public void streekCequilateralTest() {
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE, TriangleChecker.checkTriangle(1, 1, 1));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE, TriangleChecker.checkTriangle(894456684, 894456684, 894456684));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE, TriangleChecker.checkTriangle(378710059, 378710059, 378710059));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE, TriangleChecker.checkTriangle(594244357, 594244357, 594244357));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE, TriangleChecker.checkTriangle(25880563, 25880563, 25880563));
        assertEquals(TriangleType.EQUILATERAL_TRIANGLE, TriangleChecker.checkTriangle(2147483647, 2147483647, 2147483647));
    }

    @Test // ungleichseitig
    public void streekScaleneTest() {
        assertEquals(TriangleType.SCALENE_TRIANGLE, TriangleChecker.checkTriangle(4, 7, 5));
        assertEquals(TriangleType.SCALENE_TRIANGLE, TriangleChecker.checkTriangle(8, 4, 7));
        assertEquals(TriangleType.SCALENE_TRIANGLE, TriangleChecker.checkTriangle(2, 6, 7));
    }

    @Test // gleichschenklig
    public void streekIsocleseTest() {
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleChecker.checkTriangle(2, 2, 3));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleChecker.checkTriangle(3, 3, 5));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleChecker.checkTriangle(4, 4, 6));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleChecker.checkTriangle(3, 2, 2));
        assertEquals(TriangleType.ISOSCELES_TRIANGLE, TriangleChecker.checkTriangle(3, 4, 3));
    }


    //split up for easy checking
    @Test
    public void streekNoTriangleTestNegativNumber() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(-2, 4, 2));
    }

    @Test
    public void streekNoTriangleTestABCEqual() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(1, 2, 3));
    }

    @Test
    public void streekNoTriangleTestFirstZero() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(0, 2, 2));
    }

    @Test
    public void streekNoTriangleTestFirstTwoZero() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(0, 0, 2));
    }

    @Test
    public void streekNoTriangleTestAllZero() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(0, 0, 0));
    }

    @Test
    public void streekNoTriangleTestFirstLastZero() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(0, 2, 0));
    }

    @Test
    public void streekNoTriangleTestLastTwoZero() {
        assertEquals(TriangleType.NO_TRIANGLE, TriangleChecker.checkTriangle(2, 0, 0));
    }

    @Test
    public void paper4TestsNoTriangle() {
        assertEquals(TriangleTypeOwn.NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(3, 5, 9));
    }

    @Test
    public void paper4TestsEquilateralTriangle() {
        assertEquals(TriangleTypeOwn.EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(8, 8, 8));
    }

    @Test
    public void paper4TestsIsocleseTriangle() {
        assertEquals(TriangleTypeOwn.ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(8, 8, 9));
    }

    @Test
    public void paper4TestsScaleneTriangle() {
        assertEquals(TriangleTypeOwn.SCALENE_TRIANGLE, TriangleCheckerOwn.checkTriangle(3, 5, 7));
    }
}

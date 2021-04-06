package de.hsemden.sqsprak;
/*
import static de.hsemden.sqsprak.TriangleCheckerOwn.checkTriangle;
import static de.hsemden.sqsprak.TriangleType.EQUILATERAL_TRIANGLE;
import static de.hsemden.sqsprak.TriangleType.ISOSCELES_TRIANGLE;
import static de.hsemden.sqsprak.TriangleType.NO_TRIANGLE;
import static de.hsemden.sqsprak.TriangleType.SCALENE_TRIANGLE;
*/
import static de.hsemden.sqsprak.TriangleType.EQUILATERAL_TRIANGLE;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

  @Test // gleichseitig
  public void own_equilateralTest() {
    assertEquals(EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(1, 1, 1));
    assertEquals(
        EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(894456684, 894456684, 894456684));
    assertEquals(EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(378710059, 378710059, 378710059));
    assertEquals(EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(594244357, 594244357, 594244357));
    assertEquals(EQUILATERAL_TRIANGLE, TriangleCheckerOwn.checkTriangle(25880563, 25880563, 25880563));
  }

  @Test // ungleichseitig
  public void own_scaleneTestOwn() {
    assertEquals(SCALENE_TRIANGLE, TriangleCheckerOwn.checkTriangle(4, 7, 5));
    assertEquals(SCALENE_TRIANGLE, TriangleCheckerOwn.checkTriangle(8, 4, 7));
    assertEquals(SCALENE_TRIANGLE, TriangleCheckerOwn.checkTriangle(2, 6, 7));
  }

  @Test // gleichschenklig
  public void own_isocleseTestOwn() {
    assertEquals(ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(2, 2, 3));
    assertEquals(ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(3, 3, 5));
    assertEquals(ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(4, 4, 6));
    assertEquals(ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(3, 2, 2));
    assertEquals(ISOSCELES_TRIANGLE, TriangleCheckerOwn.checkTriangle(3, 4, 3));
  }

  @Test // gleichseitig
  public void own_noTriangleTestOwn() {
    assertEquals(NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(-2, 4, 2));
    assertEquals(NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(1, 2, 3));
    assertEquals(NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(2147483647, 2147483647, 2147483647));
    assertEquals(NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(0, 0, 2));
    assertEquals(NO_TRIANGLE, TriangleCheckerOwn.checkTriangle(2, 4, 2));
  }

  @Test
  public void streek_cequilateralTest() {
    assertEquals(EQUILATERAL_TRIANGLE, checkTriangle(1, 1, 1));
    assertEquals(EQUILATERAL_TRIANGLE, checkTriangle(894456684, 894456684, 894456684));
    assertEquals(EQUILATERAL_TRIANGLE, checkTriangle(378710059, 378710059, 378710059));
    assertEquals(EQUILATERAL_TRIANGLE, checkTriangle(594244357, 594244357, 594244357));
    assertEquals(EQUILATERAL_TRIANGLE, checkTriangle(25880563, 25880563, 25880563));
  }

  @Test // ungleichseitig
  public void streek_scaleneTest() {
    assertEquals(SCALENE_TRIANGLE, checkTriangle(4, 7, 5));
    assertEquals(SCALENE_TRIANGLE, checkTriangle(8, 4, 7));
    assertEquals(SCALENE_TRIANGLE, checkTriangle(2, 6, 7));
  }

  @Test // gleichschenklig
  public void streek_isocleseTest() {
    assertEquals(ISOSCELES_TRIANGLE, checkTriangle(2, 2, 3));
    assertEquals(ISOSCELES_TRIANGLE, checkTriangle(3, 3, 5));
    assertEquals(ISOSCELES_TRIANGLE, checkTriangle(4, 4, 6));
    assertEquals(ISOSCELES_TRIANGLE, checkTriangle(3, 2, 2));
    assertEquals(ISOSCELES_TRIANGLE, checkTriangle(3, 4, 3));
  }

  @Test
  public void streek_noTriangleTest() {
    assertEquals(NO_TRIANGLE, checkTriangle(-2, 4, 2));
    assertEquals(NO_TRIANGLE, checkTriangle(1, 2, 3));
    assertEquals(NO_TRIANGLE, checkTriangle(2147483647, 2147483647, 2147483647));
    assertEquals(NO_TRIANGLE, checkTriangle(0, 0, 2));
    assertEquals(NO_TRIANGLE, checkTriangle(2, 4, 2));
  }
}

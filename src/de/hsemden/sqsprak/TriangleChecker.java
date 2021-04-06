package de.hsemden.sqsprak;

public class TriangleChecker {

  public static TriangleType checkTriangle(int a, int b, int c) {
    if (a == b && b == c) {
      return TriangleType.EQUILATERAL_TRIANGLE; // gleichseitig
    } else if (a != b && a != c && b != c) {
      return TriangleType.SCALENE_TRIANGLE; // ungleichseitig
    } else if (a == b && a + b > c) {
      return TriangleType.ISOSCELES_TRIANGLE; // gleichschenklig
    }
    return TriangleType.NO_TRIANGLE;
  }
}

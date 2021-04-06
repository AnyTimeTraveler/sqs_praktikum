package de.hsemden.sqsprak;

public class TriangleChecker {
    public static TriangleType checkTriangle(int a, int b, int c) {
        if (a == b && b == c) {
            return TriangleType.EQUILATERAL_TRIANGLE;
        }
        return TriangleType.NO_TRIANGLE;
    }
}

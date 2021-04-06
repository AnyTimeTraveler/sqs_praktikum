public class TriangleChecker {
    public static TriangleType checkTriangle(int a, int b, int c) {
        if (a == b && a == c) {
            return TriangleType.EQUILATERAL_TRIANGLE;
        } else if (a + b >= c && b + c >= a) {
            if (a != b && b != c) {
                return TriangleType.SCALENE_TRIANGLE;
            } else {
                return TriangleType.ISOSCELES_TRIANGLE;
            }
        } else {
            return TriangleType.NO_TRIANGLE;
        }
    }
}


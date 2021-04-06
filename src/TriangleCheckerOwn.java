public class TriangleCheckerOwn {
    public static TriangleTypeOwn checkTriangle(int a, int b, int c) {
        if (a == b && b == c) {
            return TriangleTypeOwn.EQUILATERAL_TRIANGLE;
        }
        return TriangleTypeOwn.NO_TRIANGLE;
    }
}

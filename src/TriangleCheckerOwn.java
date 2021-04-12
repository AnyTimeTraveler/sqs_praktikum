import java.util.ArrayList;
import java.util.Collections;

public class TriangleCheckerOwn {

  public static TriangleType checkTriangle(int a, int b, int c) {
    //prevent numbers <= 0
    if (a > 0 && b > 0 && c > 0) {

      //used to sort a,b,c
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(a);
      numbers.add(b);
      numbers.add(c);

      Collections.sort(numbers);

      //a<=b<=c
      a = numbers.get(0);
      b = numbers.get(1);
      c = numbers.get(2);

      //a+b>c even if a+b > max Integer
      if ((long) a + (long) b > (long) c) {
        if (a == b && b == c) {
          return TriangleType.EQUILATERAL_TRIANGLE; // gleichseitig
        } else if (a == b) {
          return TriangleType.ISOSCELES_TRIANGLE; // gleichschenklig
        } else if (a != c && c != b) {
          return TriangleType.SCALENE_TRIANGLE; // ungleichseitig
        }
      }
    }
    return TriangleType.NO_TRIANGLE;
  }
}

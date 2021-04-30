package org.hsemden.sqs.aufgabe3;

import java.util.ArrayList;
import java.util.Collections;

public class TriangleCheckerOwn {

    private TriangleCheckerOwn() {
    }

    public static TriangleTypeOwn checkTriangle(int a, int b, int c) {
        //used to sort a,b,c
        ArrayList<Integer> numbers = new ArrayList<>(3);
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
                return TriangleTypeOwn.EQUILATERAL_TRIANGLE; // gleichseitig
            } else if (a == b || b == c || a == c) {
                return TriangleTypeOwn.ISOSCELES_TRIANGLE; // gleichschenklig
            } else {
                return TriangleTypeOwn.SCALENE_TRIANGLE; // ungleichseitig
            }
        }
        return TriangleTypeOwn.NO_TRIANGLE;
    }
}

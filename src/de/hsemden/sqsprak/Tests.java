package de.hsemden.sqsprak;

import org.junit.Test;

import static de.hsemden.sqsprak.TriangleChecker.checkTriangle;
import static de.hsemden.sqsprak.TriangleType.EQUILATERAL_TRIANGLE;
import static de.hsemden.sqsprak.TriangleType.NO_TRIANGLE;
import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void equilateralTest() {
        for (int i = 1; i < 10; i++) {
            assertEquals(EQUILATERAL_TRIANGLE, checkTriangle(i, i, i));
        }
    }

    @Test
    public void noTriangleTest() {
        for (int i = 1; i < 10; i++) {
            assertEquals(NO_TRIANGLE, checkTriangle(i * 3, i, i));
            assertEquals(NO_TRIANGLE, checkTriangle(i, i * 3, i));
            assertEquals(NO_TRIANGLE, checkTriangle(i, i, i * 3));
        }
    }
}

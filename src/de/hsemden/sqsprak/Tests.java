package de.hsemden.sqsprak;

import org.junit.Test;

import static de.hsemden.sqsprak.TriangleChecker.checkTriangle;
import static de.hsemden.sqsprak.TriangleType.EQUILATERAL_TRIANGLE;
import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void equalTest(){
        assertEquals(EQUILATERAL_TRIANGLE, checkTriangle(6,6,6));
    }
}

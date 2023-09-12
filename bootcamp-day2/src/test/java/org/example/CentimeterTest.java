package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {

    // rename the test methods, actions -> output
    @Test
    public void showEqualIfCentimeterIsEqualToOtherCentimeterTest() {
        Centimeter c1 = new Centimeter(1);
        Centimeter c2 = new Centimeter(1);
        assertEquals(c1, c2);
    }

    @Test
    public void showNonEqualIfCentimeterIsEqualToOtherCentimeterTest() {
        Centimeter c1 = new Centimeter(1);
        Centimeter c2 = new Centimeter(2);
        assertFalse(c1.equals(c2));
    }
}
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {

    @Test
    public void passTheCaseIfCentimeterIsEqualTest() {
        Centimeter c1 = new Centimeter(1, "cm");
        Centimeter c2 = new Centimeter(1, "cm");
        assertTrue(c1.equals(c2));
    }

    @Test
    public void failTheCaseIfCentimeterIsNotEqualTest() {
        Centimeter c1 = new Centimeter(1, "cm");
        Centimeter c2 = new Centimeter(1, "mm");
        assertFalse(c1.equals(c2));
    }
}
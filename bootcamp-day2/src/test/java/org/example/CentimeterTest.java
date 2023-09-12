package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    public void showEqualIfCentimeterIsEqual() {
        Centimeter c1 = new Centimeter(1, "cm");
        Centimeter c2 = new Centimeter(1, "cm");
        assertEquals("Equal", c1.returnEqualIfEqual(c2));
    }

    @Test
    public void showNotEqualIfCentimeterIsEqual() {
        Centimeter c1 = new Centimeter(1, "cm");
        Centimeter c2 = new Centimeter(1, "mm");
        assertEquals("Not Equal", c1.returnEqualIfEqual(c2));
    }
}
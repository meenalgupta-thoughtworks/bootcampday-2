package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    public void showEqualIfCentimeterIsEqualToOtherCentimeterTest() {

        final Measurement c1 = Measurement.createCentimeter(100);
        final Measurement c2 = Measurement.createCentimeter(100);
        assertEquals(c1, c2);
    }

    @Test
    public void showEqualIfCentimeterIsSameToOtherCentimeterTest() {
        final Measurement c1 = Measurement.createCentimeter(100);
        assertEquals(c1, c1);
    }

    @Test
    public void showNonEqualIfCentimeterIsEqualToOtherCentimeterTest() {
        final Measurement c1 = Measurement.createCentimeter(10);
        final Measurement c2 = Measurement.createCentimeter(100);
        assertFalse(c1.equals(c2));
    }
}
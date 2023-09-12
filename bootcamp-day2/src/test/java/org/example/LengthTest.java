package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
    public void showEqualIfCentimeterIsEqualToOtherCentimeterTest() {

        final Length c1 = Length.createCentimeter(100);
        final Length c2 = Length.createCentimeter(100);
        assertEquals(c1, c2);
    }

    @Test
    public void showEqualIfCentimeterIsSameToOtherCentimeterTest() {
        final Length c1 = Length.createCentimeter(100);
        assertEquals(c1, c1);
    }

    @Test
    public void showNonEqualIfCentimeterIsEqualToOtherCentimeterTest() {
        final Length c1 = Length.createCentimeter(10);
        final Length c2 = Length.createCentimeter(100);
        assertFalse(c1.equals(c2));
    }

    @Test
    public void showEqualIf1MeterIsEqualTo100Centimeters() {
        final Length c = Length.createCentimeter(100);
        final Length m = Length.createMeter(1);
        assertTrue(c.isCentimeterEqualsToMeter(c.getMagnitude(), m.getMagnitude()));
    }

    @Test
    public void showNotEqualIf1MeterIsEqualTo100Centimeters() {
        final Length c = Length.createCentimeter(10);
        final Length m = Length.createMeter(1);
        assertFalse(c.isCentimeterEqualsToMeter(c.getMagnitude(), m.getMagnitude()));
    }
}
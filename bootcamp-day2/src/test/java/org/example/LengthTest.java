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
        assertNotEquals(c1, c2);
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

    @Test
    public void show200CentimetersWhenInputIs100CentimetersAnd1Meter() {
        final Length c = Length.createCentimeter(100);
        final Length m = Length.createMeter(1);

        String result = c.addTheUnits(m);
        assertEquals("200.0CM", result);
    }

    @Test
    public void show2MetersWhenInputIs1metersAnd100Centimeter() {
        final Length c = Length.createCentimeter(100);
        final Length m = Length.createMeter(1);

        String result = m.addTheUnits(c);
        assertEquals("2.0M", result);
    }
}
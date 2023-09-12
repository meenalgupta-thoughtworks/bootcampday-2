package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

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

    @Test
    public void showEqualIf1MeterIsEqualTo100Centimeters() {
        final Measurement c = Measurement.createCentimeter(100);
        final Measurement m = Measurement.createMeter(1);
        assertTrue(c.isCentimeterEqualsToMeter(c.getMagnitude(), m.getMagnitude()));
    }

    @Test
    public void showNotEqualIf1MeterIsEqualTo100Centimeters() {
        final Measurement c = Measurement.createCentimeter(10);
        final Measurement m = Measurement.createMeter(1);
        assertFalse(c.isCentimeterEqualsToMeter(c.getMagnitude(), m.getMagnitude()));
    }
}
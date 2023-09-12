package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

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
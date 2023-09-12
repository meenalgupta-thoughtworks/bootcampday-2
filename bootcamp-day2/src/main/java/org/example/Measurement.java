package org.example;

import java.util.Objects;

public class Measurement {

    private final int magnitude;
    private final String unit;

    public Measurement(int magnitude, String unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public static Measurement createCentimeter(int magnitude) {
        return new Measurement(magnitude, "cm");
    }

    public static Measurement createMeter(int magnitude) {
        return new Measurement(magnitude, "m");
    }

    public Boolean isCentimeterEqualsToMeter(float cm, float m) {
        return m * 100 == cm || cm / 100 == m;
    }

    public int getMagnitude() {
        return magnitude;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;
        return magnitude == that.magnitude && Objects.equals(unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit);
    }
}

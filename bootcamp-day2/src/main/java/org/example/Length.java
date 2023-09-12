package org.example;

import java.util.Objects;

public class Length {

    private final int magnitude;
    private final String unit;

    public Length(int magnitude, String unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public static Length createCentimeter(int magnitude) {
        return new Length(magnitude, "cm");
    }

    public static Length createMeter(int magnitude) {
        return new Length(magnitude, "m");
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
        Length that = (Length) o;
        return magnitude == that.magnitude && Objects.equals(unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit);
    }

    public float addTheUnits(Length value) {

        float result = Units.M.convertTo(value.unit, value);

    }
}

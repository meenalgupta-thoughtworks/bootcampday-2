package org.example;

import java.util.Objects;

public class Length {

    private final float magnitude;
    private final Units unit;

    public Length(float magnitude, Units unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public static Length createCentimeter(int magnitude) {
        return new Length(magnitude, Units.CM);
    }

    public static Length createMeter(int magnitude) {
        return new Length(magnitude, Units.M);
    }

    public Boolean isCentimeterEqualsToMeter(float cm, float m) {
        return m * 100 == cm || cm / 100 == m;
    }

    public float getMagnitude() {
        return magnitude;
    }

    public Units getUnit() {
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

    public String addTheUnits(Length value) {
        float result = (float) ((this.unit).convertTo(value.unit, value.magnitude)) + this.magnitude;
        return result + this.unit.toString();
    }
}

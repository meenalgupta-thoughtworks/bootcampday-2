package org.example;

import java.util.Objects;

public class Centimeter {

    private final int magnitude;
    private final String unit;

    public Centimeter(int magnitude, String unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter that = (Centimeter) o;
        return magnitude == that.magnitude && Objects.equals(unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit);
    }

    public String returnEqualIfEqual(Centimeter c2) {
        if(this.equals(c2)) {
            return "Equal";
        } return "Not Equal";
    }
}

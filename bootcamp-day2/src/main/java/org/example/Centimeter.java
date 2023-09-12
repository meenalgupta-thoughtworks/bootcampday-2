package org.example;

import java.util.Objects;

public class Centimeter {
    private final int magnitude;

    public Centimeter(int magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter that = (Centimeter) o;
        return magnitude == that.magnitude;
    }

    @Override
    public int hashCode() {
        return Objects.hash(magnitude);
    }
}

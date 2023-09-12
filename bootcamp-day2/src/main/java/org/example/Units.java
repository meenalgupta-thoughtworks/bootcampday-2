package org.example;

public enum Units {
    CM(100f),
    M(1f);

    private final double conversionFactor;

    Units(float conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertTo(Units targetUnit, double value) {
        return value * (this.conversionFactor / targetUnit.conversionFactor);
    }
}
package com.example.StructuralPattern.Adaptor.round;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean fits(RoundPeg rp) {
        if (this.radius >= rp.getRadius()) {
            return true;
        }
        return false;
    }

}

package com.example.StructuralPattern.Adaptor.square;

public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return Math.pow(width, 2);
    }
}

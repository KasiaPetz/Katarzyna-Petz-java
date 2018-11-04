package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

public class Circle implements Shape {
    private final double pi = 3.14;
    private double r;

    public Circle(double r) {
        this.r = r;
    }
    @Override
    public String getShapeName() {
        return "Circle";
    }
    @Override
    public double getField() {
       return pi*r*r;
    }
}



package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    @Override
    public String getShapeName() {
        return "Triangle";
    }
    @Override
    public double getField() {
        return (a*b)/2;
    }
}


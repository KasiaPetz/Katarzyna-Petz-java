
package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public ArrayList<Shape> getFigures() {
        return figures;
    }

    public void addFigure(Shape shape) {
       figures.add(shape);

    }
    public void removeFigure(Shape shape) {
       figures.remove(shape);
    }
    public Shape getFigure(int n) {
       return figures.get(n);
    }
    public void showFigures() {
       System.out.println(figures);
  }
}


package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
        }
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapeList.size()) {
            shape = shapeList.get(n);
        }
        return shape;
    }

    public String showFigures() {
        StringBuilder strbul = new StringBuilder();
        for(Shape shapes : shapeList) {
            String result = shapes.getShapeName() + " = " + shapes.getField();
            strbul.append(result);
            strbul.append(", ");
        }
        strbul.setLength(strbul.length()-2);
        String result = strbul.toString();
        return result;
    }

    public Shape getShape() {
        return shape;
    }
}

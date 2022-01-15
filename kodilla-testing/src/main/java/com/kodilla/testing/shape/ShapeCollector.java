package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumComment;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapeList.size()) {
            shape = shapeList.get(n);
        }
        return shape;
    }

    public boolean showFigures() {
        boolean result = true;
        if (shapeList.size() >= 0) {
            for(Shape shapes: shapeList) {
                System.out.println(shapes);
            }
            result = false;
        }
        return result;
    }

    public Shape getShape() {
        return shape;
    }
}

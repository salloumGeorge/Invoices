package com.george.solid.shapes;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    ShapeType getType() {
        return ShapeType.CIRCLE;
    }
}

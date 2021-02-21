package com.george.solid.shapes;

public class Square extends Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    ShapeType getType() {
        return ShapeType.SQUARE;
    }
}

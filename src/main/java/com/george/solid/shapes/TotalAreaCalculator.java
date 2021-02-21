package com.george.solid.shapes;

import java.util.List;

import static com.george.solid.shapes.ShapeType.*;

public class TotalAreaCalculator {

    public double calculate(List<Shape> shapes) throws Exception {
        double totalArea = 0;
        for (Shape shape : shapes) {
            if (CIRCLE.equals(shape.getType())) {
                totalArea += Math.pow(((Circle) shape).getRadius(), 2) * Math.PI;
            } else if (SQUARE.equals(shape.getType())) {
                totalArea += Math.pow(((Square) shape).getSide(), 2);
            } else if (RECTANGLE.equals(shape.getType())) {
                totalArea += ((Rectangle) shape).getLength() * ((Rectangle) shape).getWidth();
            }else{
                throw new Exception("Unknown shape");
            }
        }

        return totalArea;
    }

}

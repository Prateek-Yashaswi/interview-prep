package com.example.interviews.practice.dp.creational.factory;

import com.example.interviews.practice.dp.creational.factory.shapes.Rectangle;
import com.example.interviews.practice.dp.creational.factory.shapes.Square;

public class ShapeFactory {
    public Shape getShapeObject(String shape) {
        if (shape.equalsIgnoreCase("square"))
            return new Square();
        else if (shape.equalsIgnoreCase("rectangle"))
            return new Rectangle();

        throw new RuntimeException("Implementation Not Found");
    }
}

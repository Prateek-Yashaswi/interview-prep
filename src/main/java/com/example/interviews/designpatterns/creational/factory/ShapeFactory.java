package com.example.interviews.designpatterns.creational.factory;

import com.example.interviews.designpatterns.creational.factory.shapes.Rectangle;
import com.example.interviews.designpatterns.creational.factory.shapes.Square;

public class ShapeFactory {
    public static Shape getShapeObject(String shape) {
        if (shape.equalsIgnoreCase("square"))
            return new Square();
        else if (shape.equalsIgnoreCase("rectangle"))
            return new Rectangle();

        throw new RuntimeException("Implementation Not Found");
    }
}

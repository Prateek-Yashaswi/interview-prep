package com.example.interviews.designpatterns.creational.abstractfactory.factories;

import com.example.interviews.designpatterns.creational.abstractfactory.Shape;
import com.example.interviews.designpatterns.creational.abstractfactory.shapes.normal.NormalRectangle;
import com.example.interviews.designpatterns.creational.abstractfactory.shapes.normal.NormalSquare;

public class NormalShapeFactory extends AbstractShapeFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("square"))
            return new NormalSquare();
        else if (shape.equalsIgnoreCase("rectangle"))
            return new NormalRectangle();

        throw new RuntimeException("Not Implemented");
    }
}

package com.example.interviews.designpatterns.creational.abstractfactory.factories;

import com.example.interviews.designpatterns.creational.abstractfactory.Shape;
import com.example.interviews.designpatterns.creational.abstractfactory.shapes.rounded.RoundedRectangle;
import com.example.interviews.designpatterns.creational.abstractfactory.shapes.rounded.RoundedSquare;

public class RoundedShapeFactory extends AbstractShapeFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("square"))
            return new RoundedSquare();
        else if (shape.equalsIgnoreCase("rectangle"))
            return new RoundedRectangle();

        throw new RuntimeException("Not Implemented");
    }
}

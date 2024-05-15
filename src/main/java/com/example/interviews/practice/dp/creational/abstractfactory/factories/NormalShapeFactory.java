package com.example.interviews.practice.dp.creational.abstractfactory.factories;

import com.example.interviews.practice.dp.creational.abstractfactory.Shape;
import com.example.interviews.practice.dp.creational.abstractfactory.shapes.normal.NormalRectangle;
import com.example.interviews.practice.dp.creational.abstractfactory.shapes.normal.NormalSquare;

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

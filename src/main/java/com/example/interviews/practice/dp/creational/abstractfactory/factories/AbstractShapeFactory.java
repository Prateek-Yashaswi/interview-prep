package com.example.interviews.practice.dp.creational.abstractfactory.factories;

import com.example.interviews.practice.dp.creational.abstractfactory.Shape;

public abstract class AbstractShapeFactory {
    public abstract Shape getShape(String shape);
}

package com.example.interviews.designpatterns.creational.abstractfactory.factories;

import com.example.interviews.designpatterns.creational.abstractfactory.Shape;

public abstract class AbstractShapeFactory {
    public abstract Shape getShape(String shape);
}

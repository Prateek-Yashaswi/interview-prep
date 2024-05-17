package com.example.interviews.designpatterns.creational.abstractfactory.shapes.normal;

import com.example.interviews.designpatterns.creational.abstractfactory.Shape;

public class NormalSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("NORMAL SQUARE DRAWN");
    }
}

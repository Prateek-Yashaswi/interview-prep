package com.example.interviews.designpatterns.creational.abstractfactory.shapes.normal;

import com.example.interviews.designpatterns.creational.abstractfactory.Shape;

public class NormalRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("NORMAL RECTANGLE DRAWN");
    }
}

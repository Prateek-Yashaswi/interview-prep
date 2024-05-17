package com.example.interviews.designpatterns.creational.abstractfactory.shapes.rounded;

import com.example.interviews.designpatterns.creational.abstractfactory.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("ROUNDED RECTANGLE DRAWN");
    }
}

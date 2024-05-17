package com.example.interviews.designpatterns.creational.factory.shapes;

import com.example.interviews.designpatterns.creational.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("SQUARE DRAWN");
    }
}

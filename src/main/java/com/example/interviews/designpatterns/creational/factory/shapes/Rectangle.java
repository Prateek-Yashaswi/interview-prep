package com.example.interviews.designpatterns.creational.factory.shapes;

import com.example.interviews.designpatterns.creational.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("RECTANGLE DRAWN");
    }
}

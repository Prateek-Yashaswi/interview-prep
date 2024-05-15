package com.example.interviews.practice.dp.creational.abstractfactory.shapes.normal;

import com.example.interviews.practice.dp.creational.abstractfactory.Shape;

public class NormalSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("NORMAL SQUARE DRAWN");
    }
}

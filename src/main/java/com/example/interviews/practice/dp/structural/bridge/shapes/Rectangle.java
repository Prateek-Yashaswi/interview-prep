package com.example.interviews.practice.dp.structural.bridge.shapes;

import com.example.interviews.practice.dp.structural.bridge.Color;
import com.example.interviews.practice.dp.structural.bridge.Shape;

public class Rectangle implements Shape {
    private final Color color;

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("DRAWING " + color.getColor() + " RECTANGLE");
    }
}

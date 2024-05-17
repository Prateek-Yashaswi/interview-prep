package com.example.interviews.practice.dp.structural.bridge;

import com.example.interviews.practice.dp.structural.bridge.colors.Blue;
import com.example.interviews.practice.dp.structural.bridge.colors.Red;
import com.example.interviews.practice.dp.structural.bridge.shapes.Rectangle;
import com.example.interviews.practice.dp.structural.bridge.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(new Blue());
        Shape square = new Square(new Red());

        rectangle.draw();
        square.draw();
    }
}

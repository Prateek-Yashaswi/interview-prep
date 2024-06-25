package com.example.interviews.designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        var shape1 = ShapeFactory.getShapeObject("square");
        var shape2 = ShapeFactory.getShapeObject("rectangle");

        shape1.draw();
        shape2.draw();
    }
}

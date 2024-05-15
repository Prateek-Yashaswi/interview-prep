package com.example.interviews.practice.dp.creational.factory;

public class Main {
    public static void main(String[] args) {
        var obj = new ShapeFactory();
        var shape1 = obj.getShapeObject("square");
        var shape2 = obj.getShapeObject("rectangle");

        shape1.draw();
        shape2.draw();
    }
}

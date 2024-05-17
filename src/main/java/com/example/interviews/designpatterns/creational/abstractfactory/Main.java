package com.example.interviews.designpatterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        var factory1 = FactoryProducer.getShapeFactory("normal");
        var obj1 = factory1.getShape("square");
        var obj2 = factory1.getShape("rectangle");

        obj1.draw();
        obj2.draw();


        System.out.println("-------------------------------------------------------------------------");
        var factory2 = FactoryProducer.getShapeFactory("rounded");
        var obj3 = factory2.getShape("square");
        var obj4 = factory2.getShape("rectangle");

        obj3.draw();
        obj4.draw();
    }
}

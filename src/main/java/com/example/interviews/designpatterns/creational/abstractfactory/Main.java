package com.example.interviews.designpatterns.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {

        var modern = FactoryProducer.getFurnitureFactory("modern");
        var retro = FactoryProducer.getFurnitureFactory("retro");

        var modernChair = modern.getFurniture("chair");
        var modernSofa = modern.getFurniture("sofa");

        var retroChair = retro.getFurniture("chair");
        var retroSofa = retro.getFurniture("sofa");

        modernChair.makeFurniture();
        modernSofa.makeFurniture();

        retroChair.makeFurniture();
        retroSofa.makeFurniture();
    }
}

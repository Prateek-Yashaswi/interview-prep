package com.example.interviews.designpatterns.structural.decorator;


import com.example.interviews.designpatterns.structural.decorator.decorators.MilkDecorator;
import com.example.interviews.designpatterns.structural.decorator.decorators.SugarDecorator;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        System.out.println(coffee.getDescription() + " " + coffee.getPrice());

        System.out.println("Adding Sugar");
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " " + coffee.getPrice());

        System.out.println("Adding Milk");
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " " + coffee.getPrice());
    }
}

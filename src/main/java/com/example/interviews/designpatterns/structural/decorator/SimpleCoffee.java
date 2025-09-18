package com.example.interviews.designpatterns.structural.decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getPrice() {
        return 200.0;
    }
}

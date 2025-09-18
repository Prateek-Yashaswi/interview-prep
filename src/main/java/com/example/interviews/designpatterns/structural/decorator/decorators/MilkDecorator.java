package com.example.interviews.designpatterns.structural.decorator.decorators;


import com.example.interviews.designpatterns.structural.decorator.Coffee;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 50;
    }
}

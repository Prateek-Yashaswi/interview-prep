package com.example.interviews.designpatterns.structural.decorator.decorators;


import com.example.interviews.designpatterns.structural.decorator.Coffee;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }
}

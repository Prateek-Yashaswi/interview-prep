package com.example.interviews.designpatterns.creational.factory;

public class Sea implements Logistics {

    @Override
    public void ship() {
        System.out.println("Shipped via Sea");
    }
}

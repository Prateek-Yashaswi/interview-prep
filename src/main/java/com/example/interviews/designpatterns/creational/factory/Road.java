package com.example.interviews.designpatterns.creational.factory;

public class Road implements Logistics {

    @Override
    public void ship() {
        System.out.println("Shipped via Road");
    }
}

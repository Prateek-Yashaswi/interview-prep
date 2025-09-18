package com.example.interviews.designpatterns.creational.abstractfactory.furnitures;

import designpatterns.abstractfactory.Furniture;

public class ModernChair implements Furniture {


    @Override
    public void makeFurniture() {
        System.out.println("Modern Chair Constructed");
    }
}

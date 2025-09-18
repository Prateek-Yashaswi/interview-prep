package com.example.interviews.designpatterns.creational.abstractfactory.furnitures;

import designpatterns.abstractfactory.Furniture;

public class ModernSofa implements Furniture {

    @Override
    public void makeFurniture() {
        System.out.println("Modern Sofa Constructed");
    }
}

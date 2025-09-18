package com.example.interviews.designpatterns.creational.abstractfactory.furnitures;

import designpatterns.abstractfactory.Furniture;

public class RetroChair implements Furniture {

    @Override
    public void makeFurniture() {
        System.out.println("Retro Chair Constructed");
    }
}

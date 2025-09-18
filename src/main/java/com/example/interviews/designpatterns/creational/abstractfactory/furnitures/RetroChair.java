package com.example.interviews.designpatterns.creational.abstractfactory.furnitures;

import com.example.interviews.designpatterns.creational.abstractfactory.Furniture;

public class RetroChair implements Furniture {

    @Override
    public void makeFurniture() {
        System.out.println("Retro Chair Constructed");
    }
}

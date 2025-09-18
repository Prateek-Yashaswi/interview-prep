package com.example.interviews.designpatterns.creational.abstractfactory.furnitures;

import com.example.interviews.designpatterns.creational.abstractfactory.Furniture;

public class RetroSofa implements Furniture {

    @Override
    public void makeFurniture() {
        System.out.println("Retro Sofa Constructed");
    }
}

package com.example.interviews.designpatterns.creational.abstractfactory.furnitures;


import com.example.interviews.designpatterns.creational.abstractfactory.Furniture;

public class ModernChair implements Furniture {


    @Override
    public void makeFurniture() {
        System.out.println("Modern Chair Constructed");
    }
}

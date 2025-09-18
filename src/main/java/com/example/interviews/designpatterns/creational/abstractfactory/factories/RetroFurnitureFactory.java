package com.example.interviews.designpatterns.creational.abstractfactory.factories;


import com.example.interviews.designpatterns.creational.abstractfactory.Furniture;
import com.example.interviews.designpatterns.creational.abstractfactory.furnitures.RetroChair;
import com.example.interviews.designpatterns.creational.abstractfactory.furnitures.RetroSofa;

public class RetroFurnitureFactory implements FurnitureFactory {

    @Override
    public Furniture getFurniture(String furnitureType) {
        if (furnitureType.equalsIgnoreCase("sofa")) {
            return new RetroSofa();
        } else if (furnitureType.equalsIgnoreCase("chair")) {
            return new RetroChair();
        } else {
            throw new IllegalArgumentException("Invalid furniture type");
        }
    }
}

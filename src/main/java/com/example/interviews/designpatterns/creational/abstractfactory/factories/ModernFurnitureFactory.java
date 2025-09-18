package com.example.interviews.designpatterns.creational.abstractfactory.factories;

import designpatterns.abstractfactory.Furniture;
import designpatterns.abstractfactory.furnitures.ModernChair;
import designpatterns.abstractfactory.furnitures.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Furniture getFurniture(String furnitureType) {
        if (furnitureType.equalsIgnoreCase("chair")) {
            return new ModernChair();
        } else if (furnitureType.equalsIgnoreCase("sofa")) {
            return new ModernSofa();
        } else {
            throw new IllegalArgumentException("Unknown Furniture type: " + furnitureType);
        }
    }
}

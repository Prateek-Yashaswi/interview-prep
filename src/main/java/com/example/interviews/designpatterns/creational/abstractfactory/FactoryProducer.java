package com.example.interviews.designpatterns.creational.abstractfactory;

import designpatterns.abstractfactory.factories.FurnitureFactory;
import designpatterns.abstractfactory.factories.ModernFurnitureFactory;
import designpatterns.abstractfactory.factories.RetroFurnitureFactory;

public class FactoryProducer {

    public static FurnitureFactory getFurnitureFactory(String type) {

        if (type.equalsIgnoreCase("modern")) {
            return new ModernFurnitureFactory();
        } else if (type.equalsIgnoreCase("retro")) {
            return new RetroFurnitureFactory();
        } else {
            throw new IllegalArgumentException("Unknown Furniture Type: " + type);
        }
    }
}

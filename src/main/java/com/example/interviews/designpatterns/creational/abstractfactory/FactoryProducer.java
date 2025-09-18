package com.example.interviews.designpatterns.creational.abstractfactory;


import com.example.interviews.designpatterns.creational.abstractfactory.factories.FurnitureFactory;
import com.example.interviews.designpatterns.creational.abstractfactory.factories.ModernFurnitureFactory;
import com.example.interviews.designpatterns.creational.abstractfactory.factories.RetroFurnitureFactory;

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

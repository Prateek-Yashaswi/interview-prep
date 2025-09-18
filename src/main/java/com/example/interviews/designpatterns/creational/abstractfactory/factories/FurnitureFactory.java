package com.example.interviews.designpatterns.creational.abstractfactory.factories;

import designpatterns.abstractfactory.Furniture;

public interface FurnitureFactory {

    Furniture getFurniture(String furnitureType);
}

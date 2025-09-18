package com.example.interviews.designpatterns.creational.abstractfactory.factories;


import com.example.interviews.designpatterns.creational.abstractfactory.Furniture;

public interface FurnitureFactory {

    Furniture getFurniture(String furnitureType);
}

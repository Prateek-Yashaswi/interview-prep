package com.example.interviews.designpatterns.creational.abstractfactory;

import com.example.interviews.designpatterns.creational.abstractfactory.factories.AbstractShapeFactory;
import com.example.interviews.designpatterns.creational.abstractfactory.factories.NormalShapeFactory;
import com.example.interviews.designpatterns.creational.abstractfactory.factories.RoundedShapeFactory;

public class FactoryProducer {
    public static AbstractShapeFactory getShapeFactory(String type) {
        if (type.equalsIgnoreCase("normal"))
            return new NormalShapeFactory();
        else if (type.equalsIgnoreCase("rounded"))
            return new RoundedShapeFactory();

        throw new RuntimeException("Not Implemented");
    }
}

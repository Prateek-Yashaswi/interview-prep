package com.example.interviews.designpatterns.creational.factory;

public class LogisticsFactory {

    public static Logistics getLogistics(LogisticType type) {
        return switch (type) {
            case SEA -> new Sea();
            case ROAD -> new Road();
        };
    }
}

package com.example.interviews.designpatterns.creational.factory;

public class Main {

    public static void main(String[] args) {

        var sea = LogisticsFactory.getLogistics(LogisticType.SEA);
        sea.ship();

        var road = LogisticsFactory.getLogistics(LogisticType.ROAD);
        road.ship();
    }
}

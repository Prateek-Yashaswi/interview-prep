package com.example.interviews.designpatterns.creational.builder;

public class Main {

    public static void main(String[] args) {

        var house = HouseBuilder.builder()
                .hasGarage(true)
                .hasSwimmingPools(true)
                .totalDoors(5)
                .totalRooms(3)
                .totalWindows(1)
                .build();

        System.out.println(house);
    }
}

package com.example.interviews.designpatterns.creational.builder;

public class HouseBuilder {
    private boolean hasGarage;
    private boolean hasSwimmingPools;
    private int totalRooms;
    private int totalDoors;
    private int totalWindows;

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    public HouseBuilder hasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HouseBuilder hasSwimmingPools(boolean hasSwimmingPools) {
        this.hasSwimmingPools = hasSwimmingPools;
        return this;
    }

    public HouseBuilder totalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
        return this;
    }

    public HouseBuilder totalDoors(int totalDoors) {
        this.totalDoors = totalDoors;
        return this;
    }

    public HouseBuilder totalWindows(int totalWindows) {
        this.totalWindows = totalWindows;
        return this;
    }

    public House build() {
        return new House(hasGarage, hasSwimmingPools, totalRooms, totalDoors, totalWindows);
    }
}

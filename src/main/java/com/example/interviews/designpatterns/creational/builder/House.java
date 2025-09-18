package com.example.interviews.designpatterns.creational.builder;

public record House(boolean hasGarage,
                    boolean hasSwimmingPools,
                    int totalRooms,
                    int totalDoors,
                    int totalWindows) {
}

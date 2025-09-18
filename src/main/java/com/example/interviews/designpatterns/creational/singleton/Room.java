package com.example.interviews.designpatterns.creational.singleton;

public class Room {

    private boolean isOccupied;
    private static final Room roomInstance = new Room();

    private Room() {
        // To hide the public constructor
    }

    public static Room getInstance() {
        return roomInstance;
    }

    public void setOccupied(boolean occupied) {
        System.out.println("Occupied " + occupied);
        this.isOccupied = occupied;
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }
}

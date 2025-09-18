package com.example.interviews.designpatterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        var room = Room.getInstance();
        var room1 = Room.getInstance();

        room.setOccupied(true);
        System.out.println(room.isOccupied());
        System.out.println(room1.isOccupied());

        room.setOccupied(false);
        System.out.println(room.isOccupied());
        System.out.println(room1.isOccupied());
    }
}

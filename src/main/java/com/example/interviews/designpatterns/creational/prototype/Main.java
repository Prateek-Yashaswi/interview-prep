package com.example.interviews.designpatterns.creational.prototype;

public class Main {

    public static void main(String[] args) {

        var hero = new Hero();
        var dragon1 = new Enemy("Dragon", 100, 35);
        var dragon2 = dragon1.createCharacterPrototype();
        var dragon3 = dragon2.createCharacterPrototype();

        System.out.println(dragon1);
        System.out.println(dragon2);
        System.out.println(dragon3);

        hero.hit(dragon1, 10);
        System.out.println(dragon1);
        System.out.println(dragon2);
        System.out.println(dragon3);
    }
}

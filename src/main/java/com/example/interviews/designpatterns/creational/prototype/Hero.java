package com.example.interviews.designpatterns.creational.prototype;

public class Hero {

    public void hit(Enemy enemy, int damage) {
        enemy.setHealth(enemy.getHealth() - damage);
    }
}

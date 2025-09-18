package com.example.interviews.designpatterns.creational.prototype;

public class Enemy implements CharacterPrototype {

    private String type;
    private int health;
    private int attackPower;

    public Enemy(String type, int health, int attackPower) {
        this.type = type;
        this.health = health;
        this.attackPower = attackPower;
    }

    @Override
    public CharacterPrototype createCharacterPrototype() {
        return new Enemy(this.type, this.health, this.attackPower);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "type='" + type + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                '}';
    }
}

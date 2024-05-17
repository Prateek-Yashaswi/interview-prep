package com.example.interviews.designpatterns.behavioral.strategy;

import com.example.interviews.designpatterns.behavioral.strategy.festivals.DiwaliDiscounter;
import com.example.interviews.designpatterns.behavioral.strategy.festivals.HoliDiscounter;

public class Main {
    public static void main(String[] args) {
        // It's Holi
        Discounter holiDiscounter = new HoliDiscounter();
        System.out.println(holiDiscounter.applyDiscount(1000.0) + " <- 10% Discount Applied Since it's Holi");

        // It's Diwali
        Discounter diwaliDiscounter = new DiwaliDiscounter();
        System.out.println(diwaliDiscounter.applyDiscount(1000.0) + " <- 50% Discount Applied Since its Diwali");
    }
}

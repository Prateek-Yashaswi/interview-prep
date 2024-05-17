package com.example.interviews.practice.dp.structural.decorator.items;

import com.example.interviews.practice.dp.structural.decorator.TreeDecorator;
import com.example.interviews.practice.dp.structural.decorator.christmastree.ChristmasTree;

public class Candies extends TreeDecorator {
    public Candies(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " With Candies";
    }
}

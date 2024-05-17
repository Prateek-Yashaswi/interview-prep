package com.example.interviews.practice.dp.structural.decorator.items;

import com.example.interviews.practice.dp.structural.decorator.TreeDecorator;
import com.example.interviews.practice.dp.structural.decorator.christmastree.ChristmasTree;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}

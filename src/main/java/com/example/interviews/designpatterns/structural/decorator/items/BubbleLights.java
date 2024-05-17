package com.example.interviews.designpatterns.structural.decorator.items;

import com.example.interviews.designpatterns.structural.decorator.christmastree.ChristmasTree;
import com.example.interviews.designpatterns.structural.decorator.TreeDecorator;

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

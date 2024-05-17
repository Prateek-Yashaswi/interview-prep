package com.example.interviews.designpatterns.structural.decorator;

import com.example.interviews.designpatterns.structural.decorator.christmastree.ChristmasTree;

public class TreeDecorator implements ChristmasTree {
    private final ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}

package com.example.interviews.designpatterns.structural.decorator;

import com.example.interviews.designpatterns.structural.decorator.christmastree.ChristmasTree;
import com.example.interviews.designpatterns.structural.decorator.christmastree.ChristmasTreeImpl;
import com.example.interviews.designpatterns.structural.decorator.items.BubbleLights;
import com.example.interviews.designpatterns.structural.decorator.items.Candies;

public class Main {
    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        var treeDecorator = new TreeDecorator(christmasTree);

        System.out.println(treeDecorator.decorate());

        ChristmasTree christmasTree1 = new ChristmasTreeImpl();
        var treeDecorator1 = new TreeDecorator(new BubbleLights(christmasTree1));

        System.out.println(treeDecorator1.decorate());

        ChristmasTree christmasTree2 = new ChristmasTreeImpl();
        var treeDecorator2 = new TreeDecorator(new BubbleLights(new Candies(christmasTree2)));

        System.out.println(treeDecorator2.decorate());
    }
}

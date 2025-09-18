package com.example.interviews.designpatterns.structural.composite.betterexample;


public class Main {

    public static void main(String[] args) {

        var e1 = new Developer("E1", "Java");
        var e2 = new Developer("E2", "Python");
        var e3 = new Designer("E3", "Figma");

        var leadDev = new Developer("E4", "Lead Engineering");
        leadDev.addSubordinate(e1);
        leadDev.addSubordinate(e2);

        var leadDesign = new Designer("E5", "Lead Design");
        leadDesign.addSubordinate(e3);

        var manager = new Manager("E6", "Team Name");
        manager.addSubordinate(leadDev);
        manager.addSubordinate(leadDesign);

        manager.showDetails();
    }
}

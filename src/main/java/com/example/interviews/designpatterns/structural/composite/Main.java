package com.example.interviews.designpatterns.structural.composite;

import com.example.interviews.designpatterns.structural.composite.composites.Manager;
import com.example.interviews.designpatterns.structural.composite.leaf.Designer;
import com.example.interviews.designpatterns.structural.composite.leaf.Developer;

public class Main {

    public static void main(String[] args) {

        var prateek = new Developer("Prateek", "Developer");
        var yashaswi = new Designer("Yashaswi", "Designer");

        var py = new Manager("PY", "Manager");
        py.addEmployee(prateek);
        py.addEmployee(yashaswi);

        prateek.showDetails();
        yashaswi.showDetails();
        py.showDetails();
    }
}

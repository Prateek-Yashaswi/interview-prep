package com.example.interviews.designpatterns.structural.composite.exampleone.leaf;

import com.example.interviews.designpatterns.structural.composite.exampleone.Employee;

public class Designer implements Employee {

    private final String name;
    private final String role;

    public Designer(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer: " + name + " (" + role + ")");
    }
}

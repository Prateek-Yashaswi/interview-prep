package com.example.interviews.designpatterns.structural.composite.betterexample;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

    private final String name;
    private final String department;
    private final List<Employee> subordinates;

    protected Employee(String name, String department) {
        this.name = name;
        this.department = department;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    public void showDetails() {
        System.out.println(department + ": " + name);
        for (Employee e : subordinates) {
            e.showDetails();   // recursive call → uniform treatment
        }
    }
}

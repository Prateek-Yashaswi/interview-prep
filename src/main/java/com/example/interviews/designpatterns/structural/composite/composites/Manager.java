package com.example.interviews.designpatterns.structural.composite.composites;

import com.example.interviews.designpatterns.structural.composite.Employee;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private final String name;
    private final String role;
    private final List<Employee> subordinates;

    public Manager(String name, String role) {
        this.name = name;
        this.role = role;
        subordinates = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        subordinates.add(employee);
    }

    public void removeEmployee(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + " [Role: " + role + "]");
        for (Employee e : subordinates) {
            e.showDetails();
        }
    }
}

package com.example.interviews.designpatterns.structural.composite.departments;

import com.example.interviews.designpatterns.structural.composite.Department;

public class SalesDepartment implements Department {

    private final int id;
    private final String name;

    public SalesDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartment() {
        System.out.println(name);
    }
}

package com.example.interviews.practice.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite Element
public class HeadDepartment implements Department {
    private final int id;
    private final String name;

    private final List<Department> departments;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.departments = new ArrayList<>();
    }

    @Override
    public void printDepartment() {
        departments.forEach(Department::printDepartment);
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public void removeDepartment(Department department) {
        try {
            departments.remove(department);
        } catch (Exception ex) {
            System.out.println("Department passed doesn't exist");
        }
    }
}

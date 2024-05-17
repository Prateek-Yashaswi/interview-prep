package com.example.interviews.designpatterns.creational.prototype;

import java.util.List;

public class Employee implements Cloneable {

    private final String name;
    private final List<Integer> salaries;

    public Employee(String name, List<Integer> salaries) {
        this.name = name;
        // salaries is mutable
        this.salaries = salaries;

        // to make it immutable
        // this.salaries = new ArrayList<>(salaries);
    }

    // This creates a shallow copy
    @Override
    protected Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    /**
     * <p> THis creates a deep copy </p>
     * <p>
     * {@code
     *
     * @Override
     * protected Employee clone() throws CloneNotSupportedException {
     *      Employee originalShallow = (Employee) super.clone();
     *      this.salaries = new ArrayList<>(originalShallow.salaries);
     *      return new Employee(originalShallow.name, salaries);
     * }
     * }
     */

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaries=" + salaries +
                '}';
    }
}

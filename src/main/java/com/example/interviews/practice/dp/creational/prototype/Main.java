package com.example.interviews.practice.dp.creational.prototype;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        var l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        Employee e1 = new Employee("Prateek", l1);
        var e2 = e1.clone();

        // Since list is mutable, it will be displayed in both the objects
        l1.add(4);
        // If you make the list immutable (Refer Employee.class), both will show only [1,2]
        System.out.println(e1);
        System.out.println(e2);
    }
}

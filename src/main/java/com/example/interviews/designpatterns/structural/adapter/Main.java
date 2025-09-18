package com.example.interviews.designpatterns.structural.adapter;

public class Main {

    public static void main(String[] args) {

        var adapter = new AdapterImpl();

        System.out.println("Full Output: " + adapter.getDefaultOutput());
        System.out.println("Half Output: " + adapter.getHalfOutput());
        System.out.println("Quarter Output: " + adapter.getQuarterOutput());
    }
}

package com.example.interviews.designpatterns.creational.singleton;

public class SingletonClass {
    private static final SingletonClass instance = new SingletonClass();
    private int data;

    // To avoid initialization using "new"
    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

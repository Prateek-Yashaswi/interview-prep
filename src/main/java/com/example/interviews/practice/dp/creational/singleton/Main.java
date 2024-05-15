package com.example.interviews.practice.dp.creational.singleton;

public class Main {
    public static void main(String[] args) {
        var obj1 = SingletonClass.getInstance();
        obj1.setData(100);

        var obj2 = SingletonClass.getInstance();
        System.out.println(obj2.getData());
    }
}

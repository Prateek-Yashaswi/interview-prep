package com.example.interviews.designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        ExpensiveProcess expensiveProcess = new ExpensiveProcessProxy();
        expensiveProcess.process();
    }
}

package com.example.interviews.designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        ExpensiveProcess expensiveProcess = new ExpensiveProcessProxy();
        expensiveProcess.process();

        System.out.println("\nTHIS SHOULD NOT RE-INITIALIZE THE PROCESS AND INSTEAD REUSE THE PREVIOUS ONE");
        ExpensiveProcess expensiveProcess1 = new ExpensiveProcessProxy();
        expensiveProcess1.process();
    }
}

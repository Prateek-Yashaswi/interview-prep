package com.example.interviews.designpatterns.structural.proxy;

public class ExpensiveProcessImpl implements ExpensiveProcess {

    public ExpensiveProcessImpl() {
        initializeWithExpensiveConfiguration();
    }

    @Override
    public void process() {
        System.out.println("PROCESS COMPLETED");
    }

    public void initializeWithExpensiveConfiguration() {
        System.out.println("EXPENSIVE CONFIGURATIONS DONE");
    }
}

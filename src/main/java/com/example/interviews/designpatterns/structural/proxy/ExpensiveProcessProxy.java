package com.example.interviews.designpatterns.structural.proxy;

import java.util.Objects;

public class ExpensiveProcessProxy implements ExpensiveProcess {

    private ExpensiveProcess expensiveProcess;

    @Override
    public void process() {
        if (Objects.isNull(expensiveProcess))
            expensiveProcess = new ExpensiveProcessImpl();

        expensiveProcess.process();
    }
}

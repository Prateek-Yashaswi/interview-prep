package com.example.interviews.designpatterns.behavioral.command.operations;

import com.example.interviews.designpatterns.behavioral.command.Operations;

public class Save implements Operations {
    @Override
    public void execute() {
        System.out.println("SAVE OPERATION EXECUTED");
    }
}

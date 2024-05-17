package com.example.interviews.designpatterns.behavioral.command.operations;

import com.example.interviews.designpatterns.behavioral.command.Operations;

public class Delete implements Operations {
    @Override
    public void execute() {
        System.out.println("DELETE OPERATION EXECUTED");
    }
}

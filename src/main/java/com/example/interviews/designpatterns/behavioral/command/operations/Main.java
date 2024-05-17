package com.example.interviews.designpatterns.behavioral.command.operations;

import com.example.interviews.designpatterns.behavioral.command.Operations;

public class Main {
    public static void main(String[] args) {
        // When Saving
        Operations save = new Save();
        save.execute();

        // When Deleting
        Operations delete = new Delete();
        delete.execute();
    }
}

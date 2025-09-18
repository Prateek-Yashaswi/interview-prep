package com.example.interviews.designpatterns.behavioral.chainofresponsibility;

public class Level2Support extends SupportDesk {

    @Override
    public void handleRequest(String issue) {
        System.out.println("Handling Level 2 support " + issue);
    }
}

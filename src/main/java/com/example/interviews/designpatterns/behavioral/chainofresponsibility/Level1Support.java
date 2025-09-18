package com.example.interviews.designpatterns.behavioral.chainofresponsibility;

public class Level1Support extends SupportDesk {

    @Override
    public void handleRequest(String issue) {
        if (issue.equalsIgnoreCase("password-reset")) {
            System.out.println("Handling level one support");
            return;
        }

        nextSupportDesk.handleRequest(issue);
    }
}

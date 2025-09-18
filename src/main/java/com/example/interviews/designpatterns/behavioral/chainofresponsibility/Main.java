package com.example.interviews.designpatterns.behavioral.chainofresponsibility;

public class Main {

    public static void main(String[] args) {

        SupportDesk supportDesk1 = new Level1Support();
        SupportDesk supportDesk2 = new Level2Support();

        supportDesk1.handleRequest("password-reset");
        supportDesk2.handleRequest("other-issue");
    }
}

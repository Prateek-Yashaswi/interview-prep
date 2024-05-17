package com.example.interviews.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        var studentObj = StudentBuilder.builder()
                                        .setId(101)
                                        .setName("Prateek")
                                        .build();

        System.out.println(studentObj.id());
        System.out.println(studentObj.name());
    }
}

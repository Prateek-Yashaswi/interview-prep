package com.example.interviews.designpatterns.structural.adapter;

public class Socket {
    public Volt getDefaultVoltage() {
        return new Volt(120);
    }
}

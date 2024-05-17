package com.example.interviews.designpatterns.structural.adapter;

public interface SocketAdapter {
    Volt get120Volt();

    Volt get12Volt();

    Volt get240Volt();
}

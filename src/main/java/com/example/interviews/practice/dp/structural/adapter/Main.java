package com.example.interviews.practice.dp.structural.adapter;

public class Main {
    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        var volt120 = socketAdapter.get120Volt();
        var volt240 = socketAdapter.get240Volt();
        var volt12 = socketAdapter.get12Volt();

        System.out.println(volt12);
        System.out.println(volt120);
        System.out.println(volt240);
    }
}

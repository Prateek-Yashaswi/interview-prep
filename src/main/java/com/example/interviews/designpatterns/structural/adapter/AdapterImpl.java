package com.example.interviews.designpatterns.structural.adapter;

public class AdapterImpl implements Adapter {

    private final Socket socket = new Socket();

    @Override
    public int getDefaultOutput() {
        return socket.getVoltage();
    }

    @Override
    public int getHalfOutput() {
        return socket.getVoltage() / 2;
    }

    @Override
    public int getQuarterOutput() {
        return socket.getVoltage() / 4;
    }
}

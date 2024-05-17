package com.example.interviews.designpatterns.structural.adapter;

public class SocketAdapterImpl implements SocketAdapter {

    Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getDefaultVoltage();
    }

    @Override
    public Volt get12Volt() {
        return voltageConvertor(socket.getDefaultVoltage(), 0.1);
    }

    @Override
    public Volt get240Volt() {
        return voltageConvertor(socket.getDefaultVoltage(), 2.0);
    }

    private Volt voltageConvertor(Volt volt, Double multiplier) {
        var i = volt.getVoltage() * multiplier;
        return new Volt((int) i);
    }
}

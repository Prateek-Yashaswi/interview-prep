package com.example.interviews.designpatterns.structural.adapter;

public class Volt {
    private final Integer voltage;

    public Volt(Integer voltage) {
        this.voltage = voltage;
    }

    public Integer getVoltage() {
        return voltage;
    }

    @Override
    public String toString() {
        return "Volt{" +
                "Converted Voltage=" + voltage +
                '}';
    }
}

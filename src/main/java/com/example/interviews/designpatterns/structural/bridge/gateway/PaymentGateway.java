package com.example.interviews.designpatterns.structural.bridge.gateway;

public interface PaymentGateway {
    void processPayment(double amount);
    String getGatewayInfo();
}

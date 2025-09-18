package com.example.interviews.designpatterns.structural.bridge.gateway;

public class PaypalGateway implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Paying " + amount + " Via Paypal");
    }

    @Override
    public String getGatewayInfo() {
        return "Paypal";
    }
}

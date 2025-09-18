package com.example.interviews.designpatterns.structural.bridge.gateway;

public class StripeGateway implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Paying " + amount + " Via Stripe");
    }

    @Override
    public String getGatewayInfo() {
        return "Stripe";
    }
}

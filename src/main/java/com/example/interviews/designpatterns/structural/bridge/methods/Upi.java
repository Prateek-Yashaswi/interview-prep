package com.example.interviews.designpatterns.structural.bridge.methods;


import com.example.interviews.designpatterns.structural.bridge.gateway.PaymentGateway;

public class Upi implements Payment {

    private final PaymentGateway paymentGateway;

    public Upi(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " Via UPI on " + paymentGateway.getGatewayInfo() + " gateway");
        paymentGateway.processPayment(amount);
    }
}

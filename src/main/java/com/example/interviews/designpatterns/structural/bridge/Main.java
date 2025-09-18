package com.example.interviews.designpatterns.structural.bridge;

import com.example.interviews.designpatterns.structural.bridge.gateway.PaypalGateway;
import com.example.interviews.designpatterns.structural.bridge.gateway.StripeGateway;
import com.example.interviews.designpatterns.structural.bridge.methods.CreditCard;
import com.example.interviews.designpatterns.structural.bridge.methods.Upi;

public class Main {

    public static void main(String[] args) {

        var paypalGateway = new PaypalGateway();
        var stripeGateway = new StripeGateway();
        var creditCard = new CreditCard(paypalGateway);
        var upi = new Upi(stripeGateway);

        creditCard.pay(100.0);
        upi.pay(200.0);
    }
}

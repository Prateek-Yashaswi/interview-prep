package com.example.interviews.designpatterns.behavioral.strategy.festivals;

import com.example.interviews.designpatterns.behavioral.strategy.Discounter;

public class DiwaliDiscounter implements Discounter {
    @Override
    public Double applyDiscount(Double amount) {
        return amount * 0.5; // 50% Discount
    }
}

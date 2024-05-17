package com.example.interviews.designpatterns.behavioral.strategy.festivals;

import com.example.interviews.designpatterns.behavioral.strategy.Discounter;

public class HoliDiscounter implements Discounter {
    @Override
    public Double applyDiscount(Double amount) {
        return amount * 0.9; // 10% Discount
    }
}

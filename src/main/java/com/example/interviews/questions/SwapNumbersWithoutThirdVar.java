package com.example.interviews.questions;

public class SwapNumbersWithoutThirdVar {
    public static void main(String[] args) {
        int a = 69;
        int b = 99;
        System.out.println("a=" +a + " " + "b=" + b);


        b = b - a;
        a = a + b;
        b = a - b;

        System.out.println("a=" +a + " " + "b=" + b);
    }
}

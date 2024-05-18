package com.example.interviews.questions;

public class AreStringsRotational {
    public static void main(String[] args) {
        String s1 = "aaba";
        String s2 = "baaa";

        if (s1.length() != s2.length())
            System.out.println("NOT ROTATIONAL");

        else {
            String concatenated = s1 + s1;
            System.out.println(concatenated.contains(s2) ? "ROTATIONAL" : "ARE NOT ROTATIONAL");
        }
    }
}

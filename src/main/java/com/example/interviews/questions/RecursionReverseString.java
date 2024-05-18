package com.example.interviews.questions;

public class RecursionReverseString {
    public static void main(String[] args) {
        String s = "Prateek";
        String res = reverseString(s);
        System.out.println(res);
    }

    private static String reverseString(String s) {
        if (s.isEmpty())
            return s;

        return reverseString(s.substring(1)) + s.charAt(0);
    }
}

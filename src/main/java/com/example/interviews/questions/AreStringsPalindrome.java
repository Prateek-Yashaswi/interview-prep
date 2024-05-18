package com.example.interviews.questions;

public class AreStringsPalindrome {
    public static void main(String[] args) {
        String input = "aba";
        int start = 0;
        int end = input.length() - 1;

        while (start <= end) {
            if(input.charAt(start) != input.charAt(end)){
                System.out.println(input + " Is Not A Palindrome String !!!");
                System.exit(0);
            }

            start++;
            end--;
        }

        System.out.println(input + " Is Palindrome String !!!");
    }
}

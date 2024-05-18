package com.example.interviews.questions;

public class ReverseASentence {
    public static void main(String[] args) {
        String input = "Reverse Words In A Sentence";
        String[] arr = input.split("\\s+"); // Split even by multiple white spaces between words

        StringBuilder reversedString = new StringBuilder();

        int n = arr.length - 1;
        while (n >= 0) {
            reversedString.append(arr[n]);
            if (n!=0) reversedString.append(" ");

            n--;
        }

        System.out.println(reversedString);
    }
}

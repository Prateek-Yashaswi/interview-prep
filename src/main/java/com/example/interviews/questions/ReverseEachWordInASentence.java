package com.example.interviews.questions;

public class ReverseEachWordInASentence {
    public static void main(String[] args) {
        String input = "Reverse Words In A Sentence";
        String[] arr = input.split(" ");

        for (int i = 0; i < arr.length; i++) {
             arr[i] = reverseWord(arr[i]);
        }

        System.out.println(String.join(" ", arr));
    }

    private static String reverseWord(String word) {
        String reversed = "";
        int end = word.length() - 1;

        while (end >= 0) {
            reversed += word.charAt(end);
            end--;
        }

        return reversed;
    }
}

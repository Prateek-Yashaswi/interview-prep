package com.example.interviews.questions;

public class AreStringsAnagram {
    public static void main(String[] args) {
        String word = "act";
        String anagram = "cat";

        if (word.length() != anagram.length())
            System.out.println(false);

        else {
            for (char c : word.toCharArray()) {
                int idx = anagram.indexOf(c); // id c is present in anagram

                if (idx != -1) {
                    anagram = anagram.substring(0, idx) + anagram.substring(idx + 1);
                }
            }

            System.out.println(anagram.isEmpty());
        }
    }
}

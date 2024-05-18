package com.example.interviews.questions;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfAString {
    public static void main(String[] args) {
        String s = "ABC";
        List<String> permutations = generatePermutations(s);
        System.out.println(permutations);
    }

    private static List<String> generatePermutations(String s) {
        List<String> result = new ArrayList<>();
        permutationUtil(s.toCharArray(), 0, result);

        return result;
    }

    private static void permutationUtil(char[] chars, int index, List<String> permutations) {
        if (index == chars.length - 1)
            permutations.add(String.valueOf(chars));

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i); // Swap index, i
            permutationUtil(chars, index + 1, permutations); // Recursive call for the newly generated array
            swap(chars, index, i); // Backtrack to Original Array
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}

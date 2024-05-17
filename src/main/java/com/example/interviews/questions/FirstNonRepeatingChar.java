package com.example.interviews.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "loveleetcode";

        Map<Character, Integer> freq = new LinkedHashMap<>();

        s.chars().mapToObj(i -> (char) i).forEach(item -> freq.put(item, freq.getOrDefault(item, 0) + 1));

        var ans = freq.entrySet().stream()
                .filter(i -> i.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(ans.isPresent() ? ans.get() : "No Such Result Found");
    }
}

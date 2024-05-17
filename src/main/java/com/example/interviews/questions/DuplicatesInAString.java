package com.example.interviews.questions;

import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesInAString {
    public static void main(String[] args) {
        String s = "Prateek";
        var freq = s.chars().mapToObj(i -> (char) i)
                            .filter(i -> i != ' ')
                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Duplicates In the word " + s + " are:");
        freq.entrySet().stream().filter(item -> item.getValue() != 1).forEach(System.out::println);
    }
}

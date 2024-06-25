package com.example.interviews.questions;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondLeastCharInAString {
    public static void main(String[] args) {
        String s = "Prateek Yashaswi";

        var frequency = s.toLowerCase().chars()
                .mapToObj(i -> (char) i)
                .filter(item -> item != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequency);

        var secondLeast = frequency.values().stream().distinct().sorted().skip(1).findAny().get();

        System.out.println("----- ANSWERS -----");
        frequency.entrySet().stream()
                .filter(item -> Objects.equals(item.getValue(), secondLeast))
                .forEach(System.out::println);
    }
}

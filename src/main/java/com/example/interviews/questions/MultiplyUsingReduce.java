package com.example.interviews.questions;

import java.util.List;

public class MultiplyUsingReduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 5, 3, 7);

        var res = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(res);
    }
}

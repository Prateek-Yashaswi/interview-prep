package leetcode.easy;

import java.util.Arrays;
import java.util.Objects;

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        var input = ", , , ,        a, eaefa";
        var output = solve(input);

        System.out.println(output);
    }

    private static int solve(String s) {
        s = s.trim();
        if (s.isBlank()) return 0;
        return (int) Arrays.stream(s.split(" ")).filter(item -> !Objects.equals(item, "")).count();
    }
}

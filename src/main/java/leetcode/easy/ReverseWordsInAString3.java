package leetcode.easy;

import java.util.Arrays;

public class ReverseWordsInAString3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(solve(s));
    }

    private static String solve(String s) {
        var split = Arrays.asList(s.split(" "));
        System.out.println(split);

        var reversed = split.stream().map(StringBuilder::new).map(StringBuilder::reverse).toList();
        System.out.println(reversed);
        return String.join(" ", reversed);
    }
}

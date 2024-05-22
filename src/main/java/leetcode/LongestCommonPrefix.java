package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = new String[]{"flower", "flow", "flight"};
        System.out.println(solve(strings));
    }

    private static String solve(String[] input) {
        Arrays.sort(input);

        String first = input[0];
        String last = input[input.length - 1];
        int commonSize = Math.min(first.length(), last.length());

        int i = 0;
        while (i < commonSize && first.charAt(i) == last.charAt(i))
            i ++;

        return first.substring(0, i);
    }
}

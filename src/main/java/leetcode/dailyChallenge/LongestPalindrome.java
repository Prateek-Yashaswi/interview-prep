package leetcode.dailyChallenge;

import java.util.HashMap;

// https://leetcode.com/problems/longest-palindrome/
public class LongestPalindrome {
    public static void main(String[] args) {
        String input = "abccccdd";

        var res = solve(input);
        System.out.println(res);
    }

    private static int solve(String s) {
        if (s.isBlank()) return 0;

        HashMap<Character, Integer> frequency = new HashMap<>();

        s.chars().mapToObj(item -> (char) item)
                .forEach(item -> frequency.put(item, frequency.getOrDefault(item, 0) + 1));

        int len = 0;
        boolean hasOdd = false;

        for (int count : frequency.values()) {
            // For each character, if its count is even, it can fully contribute to the palindrome length.
            if (count % 2 == 0) {
                len += count;
            }
            // If its count is odd, one less than its count can contribute to the palindrome (i.e., make it even), and mark that there's at least one character with an odd count.
            else {
                len += count - 1;
                hasOdd = true;
            }
        }

        // If there's any character with an odd count, you can place exactly one of those characters in the center of the palindrome, so you add 1 to the length.
        if (hasOdd) len += 1;

        return len;
    }
}

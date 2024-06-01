package leetcode.dailyChallenge;

// You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
// https://leetcode.com/problems/score-of-a-string/description/
public class ScoreOfAString {
    public static void main(String[] args) {
        String s = "hello";
        var result = solve(s);

        System.out.println(result);
    }

    private static int solve(String s) {
        int window = 1; // ending index of window, 0, 1

        int res = Math.abs(s.charAt(1) - s.charAt(0)); // initial res

        for (int i = window; i < s.length() - 1; i++) {
            int temp = Math.abs(s.charAt(i + 1) - s.charAt(i));
            res += temp;
        }

        return res;
    }
}

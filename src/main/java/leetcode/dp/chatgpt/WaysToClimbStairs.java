package leetcode.dp.chatgpt;

import java.util.Arrays;

// Given an integer 𝑛, find the number of ways to climb a staircase with n steps, taking 1 or 2 steps at a time.
public class WaysToClimbStairs {

    public static void main(String[] args) {
        var n = 5;

        var res = solution(n);
        System.out.println(res);
    }

    private static int solution(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[0] = 1;

        for (int step = 2; step <= n; step++) {
            dp[step] = dp[step - 1] + dp[step - 2];
        }

        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}

package leetcode.dp.chatgpt;

import java.util.Arrays;

// Given a rod of length n and an array of prices, determine the maximum obtainable revenue by cutting the rod into pieces.
public class MaximumRevenue {

    public static void main(String[] args) {
        var n = 4;
        var prices = new int[]{0, 1, 5, 8, 9};

        var res = solution(n, prices);
        System.out.println(res);
    }

    private static int solution(int n, int[] prices) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int val = Integer.MIN_VALUE;

            for (int j = 1; j <= i; j++) {
                val = Math.max(val, prices[j] + prices[i - j]);
            }

            dp[i] = val;
        }

        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}

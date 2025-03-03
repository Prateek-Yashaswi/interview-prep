package leetcode.dp.leetcode;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        var input = 6;

        var res = solve(input);
        System.out.println(res);
    }

    private static int solve(int n) {
        if (n == 1) return 1;

        var dp = new int[n + 1];

        dp[0] = 1; // Stay
        dp[1] = 1; // 1 Way to Climb Stair 1

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}

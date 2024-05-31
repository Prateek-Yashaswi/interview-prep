package leetcode.easy;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solve(n));
    }

    private static int solve(int n) {
        if (n <= 1) return 1;

        int[] dp = new int[n + 1];

        dp[0] = 1; // Stay at group i.e n = 0
        dp[1] = 1; // Go to the first step i.e n = 1

        // Number of ways you can climb the steps:
        // eg: n = 3
        // 1 -> Take one step at a time (1 + 1 + 1) -> [1, 1, 2, (1)]
        // 2 -> Take 2 (dp[2]) steps first and then take 1 (dp[1]) -> [1,1,2, (1 + 1)]
        // 3 -> Take 1 (dp[1]) step first and then take 2 (dp[2]) -> [1,1,2, (1+1+1)]
        // Therefore dp[3] = 3
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

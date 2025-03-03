package leetcode.medium;

import java.util.Arrays;

@SuppressWarnings("all")
public class CoinChange {
    public static void main(String[] args) {
        var amount = 11;
        var coins = new int[]{1, 5, 9};

        var res = solve(amount, coins);
        System.out.println(res);
    }

    private static int solve(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        System.out.println(Arrays.toString(dp));
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}

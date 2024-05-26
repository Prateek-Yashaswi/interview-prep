package leetcode;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1};
        var res = easySolve(arr);

        System.out.println(res);
    }

    // 2 4 1
    private static int easySolve(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    private static int solve(int[] prices) {
        int len = prices.length;
        int[] dp = new int[len];

        int cp = Integer.MAX_VALUE;
        int sp = -1;

        for (int i = 0; i < len; i++) {
            int proposedPrice = Math.min(cp, prices[i]);

            if (proposedPrice < cp) {
                cp = proposedPrice;
                sp = -1;
            } else {
                sp = Math.max(sp, prices[i]);
            }

            dp[i] = Math.max(dp[i], sp - cp);
        }

        return Arrays.stream(dp).max().getAsInt();
    }
}

package leetcode.dp.chatgpt;

// Find the nth Fibonacci number using dynamic programming.
public class Fibonacci {

    public static void main(String[] args) {
        var n = 5;
        var res = solution(n);

        System.out.println(res);
    }

    private static int solution(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

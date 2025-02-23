package leetcode.dp;

public class NthTribonacciNumber {

    public static void main(String[] args) {
        var input = 4;
        var res = solve(input);

        System.out.println(res);
    }

    private static int solve(int n) {
        if (n == 0) return 0; // If n = 0, no elements
        if (n == 1 || n == 2) return 1; // If n == 1 or 2, return 1 in both the cases

        var dp = new int[n + 1]; // Initialize an array for storing results

        dp[0] = 0; // Initialize the result for n = 0
        dp[1] = 1; // Initialize the result for n = 1
        dp[2] = 1; // Initialize the result for n = 3

        // For 3rd element onwards
        for (int i = 3; i <= n; i++) {
            // Set current result = sum of last 3 numbers
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        // Return nth result
        return dp[n];
    }
}

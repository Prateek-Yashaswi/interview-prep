package leetcode.dp.leetcode;

public class FibonacciNumber {

    public static void main(String[] args) {
        var input = 10;
        var res = solve(input);

        System.out.println(res);
    }

    private static int solve(int n) {
        if (n <= 1) return n;
        var arr = new int[n + 1];

        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}

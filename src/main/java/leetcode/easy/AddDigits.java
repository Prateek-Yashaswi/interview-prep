package leetcode.easy;

public class AddDigits {
    public static void main(String[] args) {
        int n = 38;
        int res = solve(n);

        System.out.println(res);
    }

    private static int solve(int n) {
        if (n == 0) return 0;

        int res = 0;

        while (n > 0) {
            int temp = n % 10;
            res += temp;
            n = n / 10;

            if (res < 10 && n == 0) return res;
            else if (n == 0) {
                n = res;
                res = 0;
            }
        }

        return res;
    }
}

package leetcode;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(solve(n));
    }

    //Floyd's Tortoise and Hare algorithm
    private static boolean solve(int n) {
        int slow = n, fast = n;

        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);

        return slow == 1;
    }

    private static int digitSquareSum(int n) {
        int result = 0;
        while (n > 0) {
            int temp = n % 10;
            result += temp * temp;
            n /= 10;
        }

        return result;
    }
}

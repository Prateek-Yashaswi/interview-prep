package leetcode.easy;

@SuppressWarnings("unused")
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 808201;
        System.out.println(newtonsMethod(num));
    }

    /**
     * <ol>
     * <li>This is an iterative approach to find the square root of a number.</li>
     * <li>Start with an initial guess and improve the guess iteratively by averaging the guess and the result of dividing n by the guess.</li>
     * <li>Repeat until the guess squared is close enough to n.</li>
     * </ol>
     */
    private static boolean newtonsMethod(int num) {
        if (num < 2) return true;
        long x = num / 2;
        long guess = x * x;
        while (guess > num) {
            x = (x + num / x) / 2;
            guess = x * x;
        }

        return guess == num;
    }

    /**
     * <ol>
     * <li>Consider the problem as searching for the square root of the given number, n.</li>
     * <li>Use a binary search to narrow down the potential values that, when squared, will give you n.</li>
     * <li>Start with left = 1 and right = n/2 (or right = n for small numbers).</li>
     * <li>Calculate the mid-point, square it, and compare it to n.</li>
     * <li>If the square of the mid-point is equal to n, then n is a perfect square.</li>
     * <li>If the square is greater than n, adjust the search range by moving the right boundary.</li>
     * <li>If the square is less than n, adjust the left boundary.</li>
     * <li>Continue this process until you either find a match or exhaust the search range. </li>
     * </ol>
     */
    private static boolean binarySearchMethod(int num) {
        if (num < 2) {
            return true;
        }

        long left = 1;
        long right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long guess = mid * mid;

            if (guess == num) return true;
            else if (guess < num) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}

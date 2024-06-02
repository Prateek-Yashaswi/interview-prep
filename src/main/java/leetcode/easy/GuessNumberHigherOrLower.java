package leetcode.easy;

public class GuessNumberHigherOrLower {
    /**
     * Forward declaration of guess API.
     *
     * @return -1 if guess is higher than the picked number
     * 1 if guess is lower than the picked number
     * otherwise return 0
     * int guess(int num);
     */

    //https://leetcode.com/problems/guess-number-higher-or-lower/description/
    public int guessNumber(int n) {
        return solve(1, n);
    }

    private int solve(int start, int end) {
        int mid = start + (end - start) / 2;

        if (guess(mid) == 0) return mid;
        else if (guess(mid) == -1) return solve(start, mid - 1);
        else return solve(mid + 1, end);
    }

    private int guess(int n) {
        return -1;
    }
}

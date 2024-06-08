package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;

        System.out.println(solve(nums, k));
    }

    private static int solve(int[] nums, int k) {
        return Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(k - 1).findAny().get();
    }
}

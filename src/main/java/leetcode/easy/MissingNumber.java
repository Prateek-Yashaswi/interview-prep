package leetcode.easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 0, 1};

        int res = solve(nums);
        System.out.println(res);
    }

    private static int solve(int[] nums) {
        int len = nums.length;
        int expectedSum = (len * (len + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();

        return expectedSum - actualSum;
    }
}

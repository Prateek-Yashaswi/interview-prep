package leetcode.easy;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        var input = new int[]{-100, -98, -1, 2, 3, 4};
        var output = solve(input);

        System.out.println(output);

    }

    private static int solve(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int maxProductEnd = nums[n - 1] * nums[n - 2] * nums[n - 3]; // last 3
        int maxProductStart = nums[0] * nums[1] * nums[n - 1]; // -ve * -ve * +ve

        return Math.max(maxProductEnd, maxProductStart);
    }
}

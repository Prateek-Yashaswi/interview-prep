package leetcode.easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        solveFaster(arr);
    }

    private static void solve(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int j = i;

                while (nums[j] == 0 && j < nums.length - 1) j++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        Arrays.stream(nums).forEach(System.out::println);
    }

    private static void solveFaster(int[] nums) {
        int i = 0;

        for (int item : nums) {
            if (item != 0) {
                nums[i] = item;
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}

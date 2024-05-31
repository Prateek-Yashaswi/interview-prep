package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;

        for (int item : twoSum(arr, target))
            System.out.print(item + " ");
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> compliments = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complimentIndex = compliments.get(nums[i]);

            if (complimentIndex != null) {
                return new int[]{i, complimentIndex};
            }

            compliments.put(target - nums[i], i);
        }

        return nums;
    }
}

package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 1};
        int k = 1;

        System.out.println(solve(arr, k));
    }

    // Sliding window
    private static boolean solve(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // check if current index is greater than k, if true then on each iteration remove leftmost element from set
            if (i > k) window.remove(nums[i - k - 1]);
            // try to add element to our window add method will return false if element already in the set, if it's in the set return true
            if (!window.add(nums[i])) return true;
        }
        // return false at the end
        return false;
    }
}

package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        var input = new int[]{0, 1, 2, 4, 5, 7};
        var res = solve(input);

        System.out.println(res);
    }

    private static List<String> solve(int[] nums) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            // Starting Index
            var current = nums[i];

            // Iterate While nums[i + 1] - nums[i] == 1 to find the ending index
            while (i < nums.length - 1 && nums[i + 1] - nums[i] == 1) {
                i++;
            }

            // Add current -> nums[i] in the proper format
            result.add(current == nums[i] ? String.valueOf(current) : current + "->" + nums[i]);
            i++; // Move to the next item
        }

        return result;
    }
}

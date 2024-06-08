package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,3,1};

        int res = solve(nums);
        System.out.println(res);
    }

    private static int solve(int[] nums) {
        var res = Arrays.stream(nums).boxed().distinct().sorted(Comparator.reverseOrder()).skip(2).findAny();
        return res.orElseGet(() -> Arrays.stream(nums).distinct().max().getAsInt());
    }
}

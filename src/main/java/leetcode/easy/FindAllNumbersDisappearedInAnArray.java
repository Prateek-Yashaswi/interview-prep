package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};

        List<Integer> res = solve(nums);
        System.out.println(res);
    }

    private static List<Integer> solve(int[] nums) {
        int[] temp = new int[nums.length];
        for (int num : nums) temp[num - 1] = 1;

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) if (temp[i] == 0) answer.add(i + 1);

        return answer;
    }
}

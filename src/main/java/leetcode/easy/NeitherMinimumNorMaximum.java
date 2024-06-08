package leetcode.easy;

public class NeitherMinimumNorMaximum {
    public static void main(String[] args) {
        int[] nums = new int[]{};
        int res = solve(nums);

        System.out.println(res);
    }

    private static int solve(int[] nums){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int item: nums) {
            if (item < min) min = item;
            if (item > max) max = item;
        }

        for (int item: nums) {
            if (item != min && item != max) return item;
        }

        return -1;
    }
}

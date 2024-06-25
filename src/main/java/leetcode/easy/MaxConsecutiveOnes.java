package leetcode.easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        var input = new int[]{1, 1, 0, 1, 1, 1};

        var res = solve(input);
        System.out.println(res);
    }

    private static int solve(int[] input) {
        int max = 0;
        var temp = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) temp++;
            if (input[i] == 0 || i == (input.length - 1)) {
                max = Math.max(max, temp);
                temp = 0;
            }
        }

        return max;
    }
}

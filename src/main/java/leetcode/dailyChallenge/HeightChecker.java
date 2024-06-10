package leetcode.dailyChallenge;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = new int[]{1, 1, 4, 2, 1, 3};
        int result = solve(heights);

        System.out.println(result);
    }

    private static int solve(int[] heights) {
        var sorted = Arrays.stream(heights).sorted().boxed().toList();

        int i = 0;
        int ans = 0;

        for (var item : sorted) {
            if (item != heights[i++]) ans++;
        }

        return ans;
    }
}

package leetcode.easy;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        var g = new int[]{1, 2};
        var s = new int[]{1, 2, 3};

        var res = solve(g, s);
        System.out.println(res);
    }

    private static int solve(int[] greed, int[] cookieSize) {
        Arrays.sort(cookieSize);
        Arrays.sort(greed);

        var child = 0;
        var satisfied = 0;
        var cookie = 0;

        while (child < greed.length && cookie < cookieSize.length) {
            if (cookieSize[cookie] >= greed[child]) {
                satisfied++;
                child++;
            }

            cookie++;
        }

        return satisfied;
    }
}

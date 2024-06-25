package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RelativeRanks {
    public static void main(String[] args) {
        var score = new int[]{10, 3, 8, 9, 4};
        var result = solve(score);

        System.out.println(Arrays.toString(result));
    }

    private static String[] solve(int[] score) {
        List<String> result = new ArrayList<>();

        var rankings = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).toList();

        for (int j : score) {
            var rank = rankings.indexOf(j) + 1;

            if (rank == 1) result.add("Gold Medal");
            else if (rank == 2) result.add("Silver Medal");
            else if (rank == 3) result.add("Bronze Medal");
            else result.add(String.valueOf(rank));
        }

        return result.toArray(String[]::new);
    }
}

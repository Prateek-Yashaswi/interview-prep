package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12};
        var res = solve(arr);

        Arrays.stream(res).forEach(item -> System.out.print(item + ","));
    }

    private static int[] solve(int[] arr) {
        var result = new int[arr.length];
        var sorted = Arrays.stream(arr).sorted().boxed().toList();
        var rankMap = new HashMap<Integer, Integer>();
        int rank = 1;

        for (var item : sorted) {
            if (!rankMap.containsKey(item)) rankMap.put(item, rank++);
        }

        for (var i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}

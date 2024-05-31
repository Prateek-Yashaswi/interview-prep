package leetcode.easy;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1};
        System.out.println(solveFaster(arr));
    }

    private static boolean solve(int[] arr) {
        var distinct = Arrays.stream(arr).boxed().distinct().toList();
        var original = Arrays.stream(arr).boxed().toList();

        return !distinct.equals(original);
    }

    private static boolean solveFaster(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int item: arr) {
            if (!set.add(item)) return true;
        }

        return false;
    }
}

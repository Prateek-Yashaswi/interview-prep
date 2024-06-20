package leetcode.easy;

import java.util.Arrays;
import java.util.TreeMap;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[]{2, 1, 4, 3, 9, 6};

        int[] solve = solve(arr1, arr2);

        Arrays.stream(solve).forEach(item -> System.out.print(item + " "));
    }

    private static int[] solve(int[] nums1, int[] nums2) {
        var freq = new TreeMap<Integer, Integer>();
        Arrays.stream(nums1).boxed().forEach(item -> freq.put(item, freq.getOrDefault(item, 0) + 1));

        int[] res = new int[nums1.length];
        int index = 0;

        for (var k : nums2) {
            for (int j = 0; j < freq.get(k); j++) {
                res[index++] = k;
            }

            freq.remove(k);
        }

        for (var item : freq.entrySet()) {
            for (int j = 0; j < item.getValue(); j++) {
                res[index++] = item.getKey();
            }
        }

        return res;
    }
}

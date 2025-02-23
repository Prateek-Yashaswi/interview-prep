package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        var arr1 = new int[]{4, 9, 5};
        var arr2 = new int[]{9, 4, 9, 8, 4};

        var out = solve(arr1, arr2);
        System.out.println(Arrays.toString(out));
    }

    private static int[] solve(int[] nums1, int[] nums2) {
        var freq1 = Arrays.stream(nums1).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        var res = new ArrayList<Integer>();

        System.out.println(freq1);

        for (var item : nums2) {
            if (freq1.containsKey(item)) {
                res.add(item);
                freq1.put(item, freq1.get(item) - 1);
                if (freq1.get(item) == 0) freq1.remove(item);
            }
        }

        System.out.println(res);

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}

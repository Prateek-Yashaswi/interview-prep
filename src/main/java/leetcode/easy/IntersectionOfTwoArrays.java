package leetcode.easy;

import java.util.*;

@SuppressWarnings("unused")
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};

        var res = solve3(nums1, nums2);
        Arrays.stream(res).forEach(i -> System.out.print(i + " "));
    }

    private static int[] solve(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();

        for (var item : nums1) {
            for (int j : nums2) {
                if (j == item && !ans.contains(item)) ans.add(item);
            }
        }

        int[] temp = new int[ans.size()];
        for (int i = 0; i < temp.length; i++) temp[i] = ans.get(i);
        return temp;
    }

    private static int[] solve2(int[] nums1, int[] nums2) {
        var freq = new HashMap<Integer, Integer>();
        Arrays.stream(nums1).distinct().forEach(item -> freq.put(item, freq.getOrDefault(item, 0) + 1));
        Arrays.stream(nums2).distinct().forEach(item -> freq.put(item, freq.getOrDefault(item, 0) + 1));

        var ansList = freq.entrySet().stream().filter(item -> item.getValue() == 2).map(Map.Entry::getKey).toList();

        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) ans[i] = ansList.get(i);

        return ans;
    }

    private static int[] solve3(int[] nums1, int[] nums2) {
        var freq = new HashMap<Integer, Integer>();

        // Mark Presence instead of distinct
        for (var item : nums1) freq.put(item, 1);

        for (var item : nums2) {
            if (freq.containsKey(item) && freq.get(item) == 1) {
                freq.put(item, 2);
            }
        }

        return freq.entrySet().stream()
                .filter(item -> item.getValue() == 2)
                .map(Map.Entry::getKey)
                .mapToInt(i -> i).toArray();
    }
}

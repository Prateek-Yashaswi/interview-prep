package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfMultipleArrays {
    public static List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        Arrays.stream(nums).forEach(arr -> Arrays.stream(arr).boxed().forEach(item -> freq.put(item, freq.getOrDefault(item, 0) + 1)));

        return freq.entrySet().stream()
                .filter(item -> item.getValue().equals(nums.length))
                .map(Map.Entry::getKey)
                .sorted()
                .toList();
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {3, 1, 2, 4, 5},
                {1, 2, 3, 4},
                {3, 4, 5, 6}
        };

        var answers = intersection(arr);
        System.out.println(answers);
    }
}

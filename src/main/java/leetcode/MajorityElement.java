package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,1,1,1,2,2};
        System.out.println(solve(arr));
    }

    private static int solve(int[] nums) {
        var freq = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long max = freq.values().stream().max(Comparator.naturalOrder()).get();

        return freq.entrySet().stream().filter(item -> item.getValue() == max).findFirst().get().getKey();
    }
}

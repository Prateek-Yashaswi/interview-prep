package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 2, 1, 2};
        System.out.println(solveFaster(arr));
    }

    private static int solve(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (Integer item : arr) {
            if (list.contains(item)) {
                list.remove(item);
            } else {
                list.add(item);
            }
        }

        return list.get(0);
    }

    private static int solveFaster(int[] arr) {
        var freq = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return freq.entrySet().parallelStream().filter(item -> item.getValue() == 1).toList().get(0).getKey();
    }
}

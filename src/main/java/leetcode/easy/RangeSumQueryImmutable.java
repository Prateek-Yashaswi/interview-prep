package leetcode.easy;

import java.util.List;
import java.util.stream.IntStream;

public class RangeSumQueryImmutable {

    private enum Operations {
        NUM_ARRAY,
        SUM_RANGE
    }

    private static class NumArray {

        private final int[] obj;

        public NumArray(int[] nums) {
            this.obj = nums;
        }

        public int sumRange(int left, int right) {
            return IntStream.rangeClosed(left, right).map(i -> obj[i]).sum();
        }
    }

    public static void main(String[] args) {
        var operations = List.of(Operations.NUM_ARRAY, Operations.SUM_RANGE, Operations.SUM_RANGE, Operations.SUM_RANGE);
        var nums = new int[]{1, 2, 3, 4, 5};

        var obj = new NumArray(nums);

        for (var item : operations) {
            if (item == Operations.NUM_ARRAY) {
                obj = new NumArray(nums);
            } else {
                int sumRange = obj.sumRange(0, 1);
                System.out.println(sumRange);
            }
        }
    }
}

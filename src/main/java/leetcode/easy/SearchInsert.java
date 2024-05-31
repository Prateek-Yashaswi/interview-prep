package leetcode.easy;

public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,6};
        int target = 7;

        System.out.println(solve(arr, target));
    }

    private static int solve(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target || arr[i] > target) return i;
        }

        return arr.length;
    }
}

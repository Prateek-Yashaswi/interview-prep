package leetcode.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2};
        int res = solve(arr);

        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int solve(int[] arr) {
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;
    }
}

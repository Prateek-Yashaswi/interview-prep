package leetcode.easy;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,2,3,0,4,2};
        int target = 2;
        int res = solve(arr, target);

        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int solve(int[] arr, int target) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                arr[j] = arr[i];
                j++;
            }
        }

        return j;
    }
}

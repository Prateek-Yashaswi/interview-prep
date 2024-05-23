package leetcode;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = new int[]{9,9,9};
        int[] res = solve(arr);

        for (int item : res) System.out.print(item);
    }

    private static int[] solve(int[] arr) {
        int len = arr.length;

        for (int i = len - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }

            arr[i] = 0;
        }

        arr = new int[len + 1];
        arr[0] = 1;
        return arr;
    }
}

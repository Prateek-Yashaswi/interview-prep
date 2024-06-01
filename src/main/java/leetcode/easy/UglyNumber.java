package leetcode.easy;

public class UglyNumber {
    public static void main(String[] args) {
        int n = 14;
        boolean res = solve(n);

        System.out.println(res);
    }

    private static boolean solve(int n) {
        if (n == 0) return false;

        int[] arr = new int[]{2, 3, 5};

        for (int item : arr) {
            while (n % item == 0) {
                n /= item;
            }
        }

        return n == 1;
    }
}

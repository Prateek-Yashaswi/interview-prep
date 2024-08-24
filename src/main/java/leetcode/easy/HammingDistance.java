package leetcode.easy;

public class HammingDistance {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;

        System.out.println(solve(x, y));
    }

    private static int solve(int x, int y) {
        int xor = x ^ y;

        int distance = 0;
        while (xor != 0) {
            distance += xor & 1;
            xor >>= 1;
        }

        return distance;
    }
}

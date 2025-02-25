package leetcode.easy;

public class PowerOfTwo {

    public static void main(String[] args) {
        var input = 16;
        var output = solve(input);

        System.out.println(output);
    }

    private static boolean solve(int n) {
        if (n == 0) return false;
        else if (n == 1) return true;
        else if (n % 2 != 0) return false;
        else return solve(n / 2);
    }
}

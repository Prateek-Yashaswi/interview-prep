package leetcode.easy;

public class PowerOfThree {

    public static void main(String[] args) {
        var input = 9;
        var output = solve(input);

        System.out.println(output);
    }

    private static boolean solve(int n) {
        if (n == 0) return false;
        else if (n == 1) return true;
        else if (n % 3 != 0) return false;
        else return solve(n / 3);
    }
}

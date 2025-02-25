package leetcode.easy;

public class NimGame {

    public static void main(String[] args) {
        var input = 4;
        var output = solve(input);

        System.out.println(output);
    }

    private static boolean solve(int n) {
        return n % 4 != 0;
    }
}

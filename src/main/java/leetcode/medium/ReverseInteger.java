package leetcode.medium;

public class ReverseInteger {
    public static void main(String[] args) {
        var input = -321;
        var output = solve(input);

        System.out.println(output);
    }

    private static int solve(int x) {
        var isNegative = x < 0;
        if (isNegative) x = x * -1;

        var strX = String.valueOf(x);
        var ans = new StringBuilder();

        for (int i = strX.length() - 1; i >= 0; i--) {
            ans.append(strX.charAt(i));
        }

        return isNegative ? Integer.parseInt("-" + ans) : Integer.parseInt(ans.toString());
    }
}

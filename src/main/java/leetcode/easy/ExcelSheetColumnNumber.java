package leetcode.easy;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String input = "AA";

        int res = solve(input);
        System.out.println(res);
    }

    private static int solve(String columnTitle) {
        int ans = 0;

        for (char ch : columnTitle.toCharArray()) {
            ans = ans * 26 + (ch - 'A' + 1);
        }

        return ans;
    }
}

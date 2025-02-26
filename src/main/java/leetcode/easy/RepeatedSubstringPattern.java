package leetcode.easy;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        var s = "abab";
        var res = solve(s);

        System.out.println(res);
    }

    private static boolean solve(String s) {
        var ss = s + s;
        var check = ss.substring(1, ss.length() - 1);

        return check.contains(s);
    }
}

package leetcode.easy;

public class IsSubsequence {
    public static void main(String[] args) {
        var s = "abc";
        var t = "ahbgdc";

        var res = solve(s, t);
        System.out.println(res);
    }

    private static boolean solve(String s, String t) {

        if (s.isBlank()) return true;
        if (t.isBlank()) return false;

        var currentS = 0;

        for (var i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(currentS)) currentS++;
            if (currentS == s.length()) return true;
        }

        return false;
    }
}

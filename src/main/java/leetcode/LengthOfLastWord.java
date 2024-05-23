package leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String input = "   fly me   to   the moon  ";
        System.out.println(solve(input));
    }

    private static int solve(String s) {
        var arr = s.trim().split("\\s+");
        //var arr = s.strip().split(" ");
        return arr[arr.length - 1].length();
    }
}

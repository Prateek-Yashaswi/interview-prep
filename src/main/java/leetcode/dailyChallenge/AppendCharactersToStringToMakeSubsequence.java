package leetcode.dailyChallenge;

public class AppendCharactersToStringToMakeSubsequence {
    public static void main(String[] args) {
        String s = "z";
        String t = "abcde";

        int result = solve(s, t);
        System.out.println(result);
    }

    private static int solve(String s, String t) {
        int prefixIndex = findPrefix(s, t);
        String appended = s + t.substring(prefixIndex);

        return appended.length() - s.length();
    }

    private static int findPrefix(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (tIndex < t.length() && sIndex < s.length()) {
            if (t.charAt(tIndex) == s.charAt(sIndex)) tIndex++;
            sIndex++;
        }

        return tIndex;
    }
}

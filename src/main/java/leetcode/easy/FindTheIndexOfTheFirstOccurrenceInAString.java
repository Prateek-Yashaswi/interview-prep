package leetcode.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";

        System.out.println(solve(haystack, needle));
    }

    private static int solve(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        int n = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            int charsLeft = haystack.length() - i;

            if (charsLeft >= n && haystack.charAt(i) == needle.charAt(0)) {
                String matcher = haystack.substring(i, i + n);
                if (matcher.equals(needle)) return i;
            }
        }

        return -1;
    }

}

package leetcode.easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(solve(s));
    }

    private static boolean solve(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 97 && ch <= 122 || ch >= 48 && ch <= 57)
                sb.append(ch);
        }

        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }
}

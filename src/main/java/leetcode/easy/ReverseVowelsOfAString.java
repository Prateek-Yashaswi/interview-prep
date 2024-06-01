package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String input = "hello";
        String res = solve(input);

        System.out.println(res);
    }

    private static String solve(String s) {
        List<Character> vowels = new ArrayList<>();

        for (Character ch : s.toCharArray()) {
            if (isVowel(ch)) vowels.add(ch);
        }

        Collections.reverse(vowels);

        int index = 0;
        String ans = "";

        for (Character ch : s.toCharArray()) {
            if (isVowel(ch)) {
                ans += vowels.get(index);
                index++;
            } else {
                ans += ch;
            }
        }

        return ans;
    }

    private static boolean isVowel(Character ch) {
        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U';
    }
}

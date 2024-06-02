package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";

        boolean result = solve(pattern, s);
        System.out.println(result);
    }

    private static boolean solve(String pattern, String s) {
        String[] items = s.split(" ");
        if (pattern.length() != items.length) return false;

        Map<Character, String> mapper = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!mapper.containsKey(pattern.charAt(i))) {
                if (!mapper.containsValue(items[i])) mapper.put(pattern.charAt(i), items[i]);
                else return false;
            } else if (!Objects.equals(mapper.get(pattern.charAt(i)), items[i]))
                return false;
        }

        return true;
    }
}

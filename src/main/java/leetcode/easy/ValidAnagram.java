package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "nagaram";
        String s2 = "anagram";

        boolean result = solveFaster(s1, s2);
        System.out.println(result);
    }

    private static boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> freq = new HashMap<>();

        s1.chars().mapToObj(item -> (char) item).forEach(item -> {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        });

        for (char ch : s2.toCharArray()) {
            if (!freq.containsKey(ch)) return false;

            freq.put(ch, freq.get(ch) - 1);
            if (freq.get(ch) == 0) freq.remove(ch);
        }

        System.out.println(freq);

        return freq.isEmpty();
    }

    private static boolean solveFaster(String s1, String s2) {
        char[] arrS1 = s1.toCharArray();
        char[] arrS2 = s2.toCharArray();

        Arrays.sort(arrS1);
        Arrays.sort(arrS2);

        return Arrays.equals(arrS1, arrS2);
    }
}

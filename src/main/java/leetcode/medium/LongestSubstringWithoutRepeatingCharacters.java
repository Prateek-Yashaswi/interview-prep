package leetcode.medium;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }

    // Sliding Window
    private static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return -1;

        HashMap<Character, Integer> map = new HashMap<>();
        int window_left = 0;
        int longestSubstring = 0;

        for (int window_right = 0; window_right < s.length(); window_right++) {
            char curr = s.charAt(window_right);

            if (map.containsKey(curr) && map.get(curr) >= window_left) {
                window_left = map.get(curr) + 1;
            }

            map.put(curr, window_right);
            longestSubstring = Math.max(longestSubstring, window_right - window_left + 1);
        }

        return longestSubstring;
    }
}

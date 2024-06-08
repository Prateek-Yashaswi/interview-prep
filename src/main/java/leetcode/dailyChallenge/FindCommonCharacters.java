package leetcode.dailyChallenge;

import java.util.*;
import java.util.stream.Stream;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = new String[]{"bella","label","roller"};
        var result = solve(words);

        System.out.println(result);
    }

    private static List<String> solve(String[] words) {
        int[] minFreq = new int[26];
        for (int i = 0; i < 26; i++) {
            minFreq[i] = Integer.MAX_VALUE;
        }

        // Iterate through each string
        for (String s : words) {
            int[] charCount = new int[26];
            // Count the frequency of each character in the current string
            for (char c : s.toCharArray()) {
                charCount[c - 'a']++;
            }

            // Update the minimum frequency array
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }

        // Construct the result
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }
}

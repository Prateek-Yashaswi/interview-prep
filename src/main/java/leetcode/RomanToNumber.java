package leetcode;

import java.util.Map;

public class RomanToNumber {
    public static void main(String[] args) {

        String s = "III";
        System.out.println(solve(s));
    }

    private static int solve(String s) {
        var romanMap = romanToInt();
        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = romanMap.get(s.charAt(i));

            if (curr < prev) {
                total -= curr;
            } else {
                total += curr;
            }

            prev = curr;
        }

        return total;
    }

    private static Map<Character, Integer> romanToInt() {
        return Map.ofEntries(
                Map.entry('I', 1),
                Map.entry('V', 5),
                Map.entry('X', 10),
                Map.entry('L', 50),
                Map.entry('C', 100),
                Map.entry('D', 500),
                Map.entry('M', 1000)
        );
    }
}

package leetcode.easy;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheDifference {
    public static void main(String[] args) {
        String s = "t";
        String t = "";

        System.out.println(solveFaster(s, t));
    }

    @SuppressWarnings("unused")
    private static char solve(String s, String t) {
        Map<Character, Long> m1 = s.chars()
                .mapToObj(item -> (char) item)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (char ch : t.toCharArray()) {
            m1.put(ch, m1.getOrDefault(ch, 0L) - 1);
            if (m1.get(ch) == 0) {
                m1.remove(ch);
            }
        }

        return m1.keySet().iterator().next();
    }

    private static char solveFaster(String s, String t) {
        int sum1 = 0, sum2 = 0;
        for (char ch: s.toCharArray()) sum1+=ch;
        for (char ch: t.toCharArray()) sum2+=ch;

        System.out.println(sum1);
        System.out.println(sum2);
        int res = Math.abs(sum2 - sum1);
        return (char) res;
    }
}

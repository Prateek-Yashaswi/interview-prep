package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {

    private static final List<Character> FIRST_ROW = List.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
    private static final List<Character> SECOND_ROW = List.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
    private static final List<Character> THIRD_ROW = List.of('z', 'x', 'c', 'v', 'b', 'n', 'm');

    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};

        var res = solve(words);
        Arrays.stream(res).forEach(System.out::println);
    }

    private static String[] solve(String[] words) {
        List<String> result = new ArrayList<>();

        for (var word : words) {
            var temp = word.toLowerCase();
            var line = lineSelectorUtil(temp.charAt(0));
            var flag = false;

            for (int i = 1; i < word.length(); i++) {
                if (lineSelectorUtil(word.charAt(i)) != line) break;

                if (i == word.length() - 1) flag = true;
            }

            if (flag) result.add(word);
        }

        return result.toArray(String[]::new);
    }

    private static List<Character> lineSelectorUtil(char ch) {
        if (FIRST_ROW.contains(ch)) return FIRST_ROW;
        else if (SECOND_ROW.contains(ch)) return SECOND_ROW;
        else return THIRD_ROW;
    }
}

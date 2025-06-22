package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Easy {

    private Easy() {
        // To make this a utility class
    }

    public static List<String> toUppercase(List<String> lowercaseStrings) {
        return lowercaseStrings.stream().map(String::toUpperCase).toList();
    }

    public static List<Integer> filterEven(List<Integer> numbers) {
        return numbers.stream().filter(item -> item % 2 == 0).toList();
    }

    public static List<String> startsWith(List<String> strings, Character startingChar) {
        return strings.stream().filter(item -> item.startsWith(startingChar.toString())).toList();
    }

    public static List<Integer> sort(List<Integer> nums, int order) {
        Comparator<Integer> comparator = order == -1 ? Comparator.reverseOrder() : Comparator.naturalOrder();
        return nums.stream().sorted(comparator).toList();
    }

    public static List<Integer> removeDuplicates(List<Integer> nums) {
        return nums.stream().distinct().toList();
    }

    public static Integer findExtremes(List<Integer> nums, int operation) {
        return switch (operation) {
            case -1 -> nums.stream().min(Comparator.naturalOrder()).orElse(Integer.MIN_VALUE);
            case 1 -> nums.stream().max(Comparator.naturalOrder()).orElse(Integer.MAX_VALUE);
            default -> throw new IllegalArgumentException();
        };
    }

    public static String parseWithDelimiter(List<String> strings, Character delimiter) {
        return strings.stream().collect(Collectors.joining(delimiter.toString()));
    }

    public static Integer sumAll(List<Integer> nums) {
        return nums.stream().reduce(0, Integer::sum);
    }

    public static String firstOccurrence(List<String> strings, Character startsWith) {
        return strings.stream().filter(item -> item.startsWith(startsWith.toString())).findFirst()
                .orElse("does not exist");
    }

    public static List<String> nonEmpty(List<String> strings) {
        return strings.stream().filter(item -> !item.isBlank()).toList();
    }
}

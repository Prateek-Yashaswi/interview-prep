package streams;

import streams.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Medium {

    private Medium() {
        // To make it a utility class
    }

    public static Map<Object, List<String>> groupByLength(List<String> strings) {
        return strings.stream().collect(Collectors.groupingBy(String::length));
    }

    public static List<Employee> sortByAge(List<Employee> employees, int order) {
        return switch (order) {
            case -1 -> employees.stream().sorted((a, b) -> Integer.compare(b.age(), a.age())).toList();
            case 1 -> employees.stream().sorted((a, b) -> Integer.compare(a.age(), b.age())).toList();
            default -> throw new IllegalArgumentException();
        };
    }

    public static List<Employee> sortBySalary(List<Employee> employees, int order) {
        Comparator<Employee> comparator = switch (order) {
            case 1 -> (a, b) -> Double.compare(a.salary(), b.salary());
            case -1 -> (a, b) -> Double.compare(b.salary(), a.salary());
            default -> throw new IllegalArgumentException();
        };

        return employees.stream().sorted(comparator).toList();
    }

    public static Map<String, List<Integer>> partitionByOddEven(List<Integer> nums) {
        var res = nums.stream().distinct().collect(Collectors.partitioningBy(item -> item % 2 == 0));
        return Map.ofEntries(
                Map.entry("evens", res.get(true)),
                Map.entry("odds", res.get(false))
        );
    }

    public static List<String> extractEmployeeNamesWithAgeMoreThan(List<Employee> employees, int age) {
        return employees.stream().filter(item -> item.age() > age).map(Employee::name).toList();
    }

    public static Map<String, Long> countFreqOfWords(List<String> strings) {
        return strings.stream().map(item -> Arrays.asList(item.split("\\s+")))
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));
    }

    public static Integer secondHighest(List<Integer> nums) {
        return nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(nums.get(0));
    }

    public static Map<String, Double> extractNameAndSalary(List<Employee> employees) {
        return employees.stream().collect(Collectors.toMap(Employee::name, Employee::salary));
    }

    public static String longestString(List<String> strings) {
        return strings.stream().filter(item -> !item.isBlank())
                .reduce((a, b) -> a.length() > b.length() ? a : b)
                .orElseThrow();
    }
}

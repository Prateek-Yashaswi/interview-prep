package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(solve(n));
    }

    private static boolean solve(int n) {
        var divisors = findDivisors(n).stream().filter(item -> !item.equals(n)).toList();
        return divisors.stream().reduce(0 , Integer::sum).equals(n);
    }

    private static List<Integer> findDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();

        // Iterate from 1 to the square root of n
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If i is a divisor, add it to the list
                divisors.add(i);

                // Add the corresponding divisor n / i if it's different
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        return divisors;
    }
}

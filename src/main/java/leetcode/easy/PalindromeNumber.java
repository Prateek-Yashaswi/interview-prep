package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;

        System.out.println(checkPalindrome(x));
    }

    private static boolean checkPalindrome(int n) {
        List<Integer> list = new ArrayList<>();
        int copy = n;

        if (n == 0) list.add(0);
        else {
            while (n > 0) {
                list.add(n % 10);
                n = n / 10;
            }
        }

        int pointer = list.size() - 1;

        while (pointer >= 0) {
            Integer curr = list.get(pointer);
            if (!curr.equals(copy % 10)) {
                return false;
            }

            copy = copy / 10;
            pointer--;
        }

        return true;
    }
}

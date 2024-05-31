package leetcode.easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = ")(){}";
        System.out.println(solve(s));
    }

    private static boolean solve(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() == 1) return false;

        for (Character ch : s.toCharArray()) {
            if (ch.equals('(') || ch.equals('[') || ch.equals('{'))
                stack.push(ch);
            else if (stack.isEmpty() || ((ch.equals(')') && !stack.pop().equals('(')) ||
                    (ch.equals(']') && !stack.pop().equals('[')) ||
                    (ch.equals('}') && !stack.pop().equals('{')))) {

                return false;
            }
        }

        return stack.empty();
    }
}

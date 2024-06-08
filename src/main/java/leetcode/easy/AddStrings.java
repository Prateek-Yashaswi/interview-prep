package leetcode.easy;

public class AddStrings {
    public static void main(String[] args) {
        String num1 = "456";
        String num2 = "77";

        System.out.println(solve(num1, num2));

    }

    private static String solve(String num1, String num2) {
        int num1Len = num1.length() - 1;
        int num2Len = num2.length() - 1;

        StringBuilder answer = new StringBuilder();
        int carry = 0;
        while (num1Len >= 0 || num2Len >= 0) {
            int t1 = num1Len >= 0 ? num1.charAt(num1Len) - '0' : 0;
            int t2 = num2Len >= 0 ? num2.charAt(num2Len) - '0' : 0;

            int sum = t1 + t2 + carry;
            if (sum > 10) {
                answer.append(sum - 10);
                carry = 1;
            } else {
                answer.append(sum);
            }

            num1Len--;
            num2Len--;
        }

        return answer.reverse().toString();
    }
}

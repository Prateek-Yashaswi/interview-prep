package leetcode.easy;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int input = 26;

        String result = solve(input);
        System.out.println(result);
    }

    private static String solve(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            // 26 = Total Characters A - Z
            int remainder = columnNumber % 26;

            // 65 = ASCII OF 'A'
            sb.append((char) (remainder + 65));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
}

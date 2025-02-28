package leetcode.easy;

public class StudentAbsentRecord1 {
    public static void main(String[] args) {
        var input = "PPALLL";
        var output = solve(input);

        System.out.println(output);
    }

    private static boolean solve(String s) {
        var arr = s.toCharArray();

        var absentCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                absentCount++;

                if (absentCount >= 2) {
                    return false;
                }
            }


            if (i <= arr.length - 3 && arr[i] == 'L' && arr[i + 1] == 'L' && arr[i + 2] == 'L') {
                return false;
            }
        }

        return true;
    }
}

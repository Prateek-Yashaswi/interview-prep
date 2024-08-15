package leetcode.dailyChallenge;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int change5 = 0, change10 = 0;

        for (var item : bills) {
            if (item == 5) change5++;
            else if (item == 10 && change5 > 0) {
                change5--;
                change10++;
            } else {
                if (change10 > 0) {
                    change10--;
                } else {
                    change5 -= 2;
                }

                change5--;
            }

            if (change5 < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] input = new int[]{5, 5, 5, 20};
        var output = lemonadeChange(input);

        System.out.println(output);
    }
}

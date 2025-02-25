package leetcode.easy;

public class ArrangingCoins {
    public static void main(String[] args) {
        var input = 1;
        var output = solve(input);

        System.out.println(output);
    }

    private static int solve(int totalCoins) {
        int currentRow = 1;
        while (totalCoins >= currentRow) {
            totalCoins = totalCoins - currentRow;
            currentRow++;
        }

        return currentRow - 1;
    }
}

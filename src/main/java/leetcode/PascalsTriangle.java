package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        var res = generate(numRows);

        System.out.println(res);
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) return triangle;

        List<Integer> firstRow = List.of(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j) + previousRow.get(j - 1));
            }

            currentRow.add(1);

            triangle.add(currentRow);
        }

        return triangle;
    }
}

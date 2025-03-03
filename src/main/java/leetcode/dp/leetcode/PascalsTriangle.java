package leetcode.dp.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        var input = 5;
        var res = solve(input);

        System.out.println(res);
    }

    private static List<List<Integer>> solve(int numRows) {
        var triangle = new ArrayList<List<Integer>>();

        triangle.add(List.of(1)); // First Row

        // For 2nd Row (Index 1) Upto numRows
        for (int i = 1; i < numRows; i++) {

            // Fetch prevRow For Calculation
            var prevRow = triangle.get(i - 1);

            //Create New Row And Initialize First Element As 1
            var newRow = new ArrayList<Integer>();
            newRow.add(1);

            // From 2nd Element (Index 1) onwards
            for (int j = 1; j < i; j++) {
                // Calculate the value using previous rows
                newRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }

            // Add Last element in the newRow
            newRow.add(1);

            // Add the newRow To the Triangle
            triangle.add(newRow);
        }

        return triangle;
    }
}

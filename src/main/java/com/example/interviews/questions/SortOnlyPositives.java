package com.example.interviews.questions;

import java.util.Arrays;

public class SortOnlyPositives {
    public static void main(String[] args) {
        // i/p - [9,-1,7,2,-8,3,-4]
        //	o/p - [2,-1,3,7,-8,9,-4]

        int[] newList = new int[]{9, -1, 7, 2, -8, 3, -4};

        int countPositives = 0;
        for (int n : newList) {
            if (n > 0) countPositives++;
        }

        int[] positives = new int[countPositives];

        int p = 0;
        for (int n : newList) {
            if (n > 0) {
                positives[p] = n;
                p++;
            }
        }

        for (int i = 0; i < positives.length; i++) {
            for (int j = 0; j < positives.length - 1; j++) {
                if (positives[i] < positives[j]) {
                    int temp = positives[i];
                    positives[i] = positives[j];
                    positives[j] = temp;
                }
            }
        }

        p = 0;
        for (int i = 0; i < newList.length; i++) {
            if (newList[i] > 0) {
                newList[i] = positives[p];
                p++;
            }
        }

        for (int item : newList) System.out.print(item + " ");


        System.out.println("\n\nWITHOUT USING LEGACY CODE");

        int[] newList2 = new int[]{9, -1, 7, 2, -8, 3, -4};
        var positives2 = Arrays.stream(newList).boxed().filter(i -> i > 0).sorted().toList();

        int x = 0;
        for (int i = 0; i < newList2.length; i++) {
            if (newList2[i] > 0) {
                newList2[i] = positives2.get(x);
                x++;
            }
        }

        for (int item : newList2) System.out.print(item + " ");
    }
}

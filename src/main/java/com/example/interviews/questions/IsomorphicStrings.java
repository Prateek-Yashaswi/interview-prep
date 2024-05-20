package com.example.interviews.questions;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        //Example 1:
        //	Input: s = "egg", t = "add"
        //	Output: true
        //
        //	Example 2:
        //	Input: s = "foo", t = "bar"
        //	Output: false
        //
        //	Example 3:
        //	Input: s = "paper", t = "title"
        //	Output: true

        String s1 = "abcd";
        String s2 = "pqrp";

        Boolean ans = compareUtil(s1, s2) && compareUtil(s2, s1);
        System.out.println(ans);
    }

    private static Boolean compareUtil(String s1, String s2) {
        Map<Character, Character> mapping = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char curr = s1.charAt(i);
            char map = s2.charAt(i);

            if (!mapping.containsKey(curr)) {
                mapping.put(curr, map);
            } else if (mapping.get(curr) != map) {
                return false;
            }
        }

        return true;
    }
}

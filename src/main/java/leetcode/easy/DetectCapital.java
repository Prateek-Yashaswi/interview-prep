package leetcode.easy;

public class DetectCapital {
    public static void main(String[] args) {
        String word = "Google";

        System.out.println(solve(word));
    }

    private static boolean solve(String word) {
        if (word.toUpperCase().equals(word)) return true;
        else if (word.toLowerCase().equals(word)) return true;
        else return word.substring(1).toLowerCase().equals(word.substring(1)) && word.substring(0, 1).toUpperCase().equals(String.valueOf(word.charAt(0)));
    }
}

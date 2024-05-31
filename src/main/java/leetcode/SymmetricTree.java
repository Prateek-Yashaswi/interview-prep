package leetcode;

public class SymmetricTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    private static boolean solve(TreeNode root) {
        if (root == null) return true;
        return checkIfSymmetric(root.left, root.right);
    }

    private static boolean checkIfSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        return left.val == right.val &&
                checkIfSymmetric(left.left, right.right) &&
                checkIfSymmetric(right.left, left.right);
    }
}

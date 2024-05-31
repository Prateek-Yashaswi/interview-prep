package leetcode;

public class IsSameTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    private static boolean solve(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;

        return solve(root1.left, root2.left) && solve(root1.right, root2.right);
    }
}

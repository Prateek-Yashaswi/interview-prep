package leetcode.easy;

public class PathSum {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, targetSum);
    }

    private boolean solve(TreeNode root, int target) {
        if (root == null) return false;

        if (root.left == null && root.right == null) return root.val == target;


        int newTarget = target - root.val;
        return solve(root.left, newTarget) || solve(root.right, newTarget);
    }
}

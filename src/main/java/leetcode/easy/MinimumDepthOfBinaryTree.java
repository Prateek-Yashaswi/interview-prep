package leetcode.easy;

import java.util.Objects;

public class MinimumDepthOfBinaryTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public int minDepth(TreeNode root) {
        return solve(root);
    }

    private int solve(TreeNode root) {
        if (Objects.isNull(root)) return 0;

        // If the node is a leaf node
        if (root.left == null && root.right == null) return 1;

        // If the left subtree is null, we need to consider the right subtree only
        if (root.left == null) return solve(root.right) + 1;

        // If the right subtree is null, we need to consider the left subtree only
        else if (root.right == null) return solve(root.left) + 1;

        // If both subtrees are present, return the minimum depth of both subtrees + 1
        return Math.min(solve(root.left), solve(root.right)) + 1;
    }
}

package leetcode.easy;

import java.util.Objects;

public class MaximumDepthOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public int maxDepth(TreeNode root) {
        return solve(root);
    }

    private int solve(TreeNode root) {
        if (Objects.isNull(root)) return 0;

        return Math.max(solve(root.left), solve(root.right)) + 1;
    }

}

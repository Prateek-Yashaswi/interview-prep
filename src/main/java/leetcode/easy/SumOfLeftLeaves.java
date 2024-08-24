package leetcode.easy;

import java.util.Objects;

@SuppressWarnings("all")
public class SumOfLeftLeaves {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int solve(TreeNode root) {
        if (Objects.isNull(root)) return 0;
        if (Objects.nonNull(root.left) && Objects.isNull(root.left.left) && Objects.isNull(root.left.right)) {
            return root.left.val + solve(root.right);
        }

        return solve(root.left) + solve(root.right);
    }
}

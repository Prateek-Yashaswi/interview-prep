package leetcode.easy;

public class ConvertSortedArrayToBinarySearchTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    private TreeNode construct(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = construct(nums, left, mid - 1);
        node.right = construct(nums, mid + 1, right);

        return node;
    }
}

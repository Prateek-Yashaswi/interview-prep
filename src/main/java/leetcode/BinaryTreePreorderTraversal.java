package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        return preOrder(root, new ArrayList<>());
    }

    private List<Integer> preOrder(TreeNode root, List<Integer> l1) {
        if (root != null) {
            l1.add(root.val);
            preOrder(root.left, l1);
            preOrder(root.right, l1);
        }

        return l1;
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        return inOrder(root, new ArrayList<>());
    }

    private List<Integer> inOrder(TreeNode root, List<Integer> l1) {
        if (root != null) {
            inOrder(root.left, l1);
            l1.add(root.val);
            inOrder(root.right, l1);
        }

        return l1;
    }
}

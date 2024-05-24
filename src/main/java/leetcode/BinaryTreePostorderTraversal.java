package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }


    public List<Integer> postorderTraversal(TreeNode root) {
        return postOrder(root, new ArrayList<>());
    }

    private List<Integer> postOrder(TreeNode root, List<Integer> l1) {
        if (root != null) {
            postOrder(root.left, l1);
            postOrder(root.right, l1);
            l1.add(root.val);
        }

        return l1;
    }
}

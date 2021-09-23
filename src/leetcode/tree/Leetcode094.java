package leetcode.tree;

import java.util.LinkedList;
import java.util.List;

public class Leetcode094 {
    List<Integer> res = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return res;
    }

    public void inorder(TreeNode root){
        if (root == null) return;
        inorder(root.left);
        this.res.add(root.val);
        inorder(root.right);
    }
}

package leetcode.recall_dfs;

import java.util.Arrays;

public class Leetcode105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0) return null;

        TreeNode root = new TreeNode(preorder[0]);
        int id = 0;
        for (id = 0; id < inorder.length; id++) {
             if (inorder[id] == preorder[0]) break;
        }

        root.left = buildTree(Arrays.copyOfRange(preorder, 1, id+1), Arrays.copyOfRange(inorder, 0, id));
        root.right = buildTree(Arrays.copyOfRange(preorder, id+1, preorder.length), Arrays.copyOfRange(inorder, id+1, inorder.length));
        return root;
    }
}

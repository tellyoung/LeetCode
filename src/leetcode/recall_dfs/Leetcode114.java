package leetcode.recall_dfs;

public class Leetcode114 {
    public void flatten(TreeNode root) {


        flatten(root.left);
        if (root.left != null) {
            TreeNode p = root.left;
            while (p.right!=null){
                p = p.right;
            }

        }
    }

}

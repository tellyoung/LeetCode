package leetcode.tree;

public class Leetcode437 {
    int path = 0;
    int cnt = 0;

    public int pathSum(TreeNode root, int targetSum) {
        func(root, targetSum);
        return this.cnt;
    }

    public void func(TreeNode root, int targetSum){
        if (root == null){
            return;
        } else {
            path += root.val;
            if (path == targetSum) this.cnt++;
        }

        func(root.left, targetSum);
        if (root.left != null){
            path -= root.left.val;
        }

        if (path == targetSum) this.cnt++;

        func(root.right, targetSum);
        if (root.right != null){
            path -= root.right.val;
        }
        if (path == targetSum) this.cnt++;
    }
}

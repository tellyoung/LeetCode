package leetcode.recall_dfs;

public class Leetcode104 {
    int maxn = 1;
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        dfs(root, 1);
        return maxn;
    }
    public void dfs(TreeNode root, int depth){
        if (depth>maxn){
            maxn=depth;
        }
        if (root.left!=null) dfs(root.left, depth+1);
        if (root.right!=null) dfs(root.right, depth+1);
    }
}

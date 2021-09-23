package leetcode.dp;


import java.util.HashMap;


public class Leetcode337 {
    HashMap<TreeNode, Integer> set = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) return 0;
        if (set.containsKey(root)) return set.get(root);
        int money = root.val;

        if (root.left != null) money += rob(root.left.left) + rob(root.left.right);
        if (root.right != null) money += rob(root.right.left) + rob(root.right.right);

        int res = Math.max(money, rob(root.left) + rob(root.right));
        set.put(root, res);
        return res;
    }
}

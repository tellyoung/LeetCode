package leetcode.tree;

import java.util.ArrayList;

public class GetAllWays {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        new GetAllWays().getWays(root, path, res);

        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j));
            }
            System.out.println(" ");
        }
    }

    public void getWays(TreeNode root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res){
        if (root == null) return;
        path.add(root.val);
        if (root.left == null && root.right == null){
            res.add(new ArrayList<>(path));
            return;
        }

        getWays(root.left, path, res);
        if (root.left != null) path.remove(path.size()-1);

        getWays(root.right, path, res);
        if (root.left != null) path.remove(path.size()-1);

    }
}

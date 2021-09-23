package examination.wangyi;

public class The01 {

    public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;
     public TreeNode(int val) {
         this.val = val;
    }
    }

    int sum = 0;
    int five = 0;
    public int maxMoney (TreeNode root) {
        // write code here
        dfs(root, null);

        return sum-((five/2)*5);
    }

    public void dfs(TreeNode root, TreeNode father){
         if (root==null){
            return;
         }
         if (root.left==null&&root.right==null){
             if (father!=null&&father.right!=null && father.left!=null){
                 sum+=5;
                 five++;
             }
             if (father!=null&&(father.right==null||father.left==null)){
                 sum+=2;
             }

         }
         dfs(root.left, root);
         dfs(root.right, root);
    }
}

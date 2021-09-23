package leetcode.bfs;

import leetcode.recall_dfs.TreeNode;

import java.util.ArrayList;
import java.util.Collections;

public class Leetcode101 {

    public boolean isSymmetric(TreeNode root) {
        if (root.left==null&&root.right==null) return true;
        if (root.left==null||root.right==null) return false;
        if (root.left.val!=root.right.val) return false;
        ArrayList<TreeNode> arr = new ArrayList<>();
        arr.add(root.left);
        arr.add(root.right);

        while (arr.size()!=0){
            ArrayList<TreeNode> temp = new ArrayList<>();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i)!=null){
                    temp.add(arr.get(i).left);
                    temp.add(arr.get(i).right);
                }
            }
            int i=0, j=temp.size()-1;
            while (i<j){
                if (temp.get(i)==null&&temp.get(j)==null){
                    i++;
                    j--;
                    continue;
                }
                if (temp.get(i)==null||temp.get(j)==null||temp.get(i).val!=temp.get(j).val){
                    return false;
                }
                i++;
                j--;
            }
            arr = new ArrayList<>(temp);
        }
        return true;
    }

    public static void main(String[] args) {

        //[1,2,2,3,4,4,3]
        TreeNode root = new TreeNode(1);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(1);
//        arr.add(null);
        System.out.println(arr);
        if (arr.get(0)==null){
            System.out.println("ok");
        }

        ArrayList<Integer> temp = new ArrayList<>(arr);
        Collections.reverse(arr);


        System.out.println(arr.equals(temp));
        System.out.println(arr.toString());
        System.out.println(temp.toString());

    }
}

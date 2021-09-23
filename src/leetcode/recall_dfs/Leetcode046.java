package leetcode.recall_dfs;

import java.util.ArrayList;
import java.util.List;

public class Leetcode046 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        dfs(nums,path,res,used);
        return res;
    }

    private static void dfs(int[] nums, List<Integer> path, List<List<Integer>> res, boolean[] used){
        if (path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.add(nums[i]);
            dfs(nums, path, res, used);
            used[i] = false;
            path.remove(path.size()-1);
        }
    }



    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }
}

package leetcode.recall_dfs;

import java.util.ArrayList;
import java.util.List;

public class Leetcode078 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> path = new ArrayList<>();
        dfs(nums, 0, path);
        return res;

    }

    public void dfs(int[] nums, int id, List<Integer> path){
        res.add(new ArrayList<>(path));
        for (int i = id; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, i+1, path);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new Leetcode078().subsets(nums));


    }



}

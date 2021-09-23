package leetcode.recall_dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode047 {
    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(nums, used, arr);

        return res;
    }

    public static void dfs(int[] nums, boolean[] used, ArrayList<Integer> arr){
        if (arr.size() == nums.length){
            res.add(new ArrayList<>(arr));
//            System.out.println(arr);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i!=0 && !used[i-1] && nums[i] == nums[i-1]) continue;
            if (!used[i]){
                used[i] = true;
                arr.add(nums[i]);
                dfs(nums, used, arr);
                arr.remove(arr.size()-1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2};
        System.out.println(permuteUnique(nums));
    }




}

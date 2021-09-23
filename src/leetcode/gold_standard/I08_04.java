package leetcode.gold_standard;

import java.util.*;

public class I08_04 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);

        func(0, nums, path, res);
        return res;
    }
    public void func(int id, int[] nums, List<Integer> path, List<List<Integer>> res){
        res.add(new ArrayList<>(path));
        for (int i = id; i < nums.length; i++) {
            path.add(nums[i]);
            func(i+1, nums, path, res);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new I08_04().subsets(new int[]{1, 2, 3}));
    }
}

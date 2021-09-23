package leetcode.recall_dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[candidates.length];
        int sum = 0;
        Arrays.sort(candidates);

        dfs(candidates, target, used, path, sum, res, 0);
        return res;
    }
    private void dfs(int[] candidates, int target, boolean[] used, List<Integer> path, int sum, List<List<Integer>> res, int strat){
        if (sum >= target){
            if (sum == target) res.add(new ArrayList<>(path));
            return;
        }
        for (int i = strat; i < candidates.length; i++) {
            path.add(candidates[i]);
            sum += candidates[i];
            dfs(candidates, target, used, path, sum, res, i);
            sum -= candidates[i];
            path.remove(path.size()-1);
        }

    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        Leetcode039 lt = new Leetcode039();
        System.out.println(lt.combinationSum(candidates, 7));


    }
}

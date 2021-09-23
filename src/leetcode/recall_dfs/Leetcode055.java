package leetcode.recall_dfs;

public class Leetcode055 {
    boolean flag = false;

    public boolean canJump(int[] nums) {
        boolean[] used = new boolean[nums.length];
        dfs(0, nums, used);
        return flag;
    }

    public void dfs(int id, int[] nums, boolean[] used){
        if (id >= nums.length-1){
            flag = true;
            return;
        }

        for (int i = id+1; i <= id + nums[id]; i++) {
            if (flag) break;
            if (!used[i]){
                used[i] = true;
                dfs(i, nums, used);
            }

        }
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        Leetcode055 lt = new Leetcode055();
        System.out.println(lt.canJump(nums));
    }
}

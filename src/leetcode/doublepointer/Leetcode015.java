package leetcode.doublepointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode015 {
    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < len-1; i++) {
            if (nums[i] > 0) break;
            int p1 = i + 1, p2 = len - 1;
            if (i>0&&nums[i]==nums[i-1]) continue;
            while (p1 < p2){
                if (nums[i]+nums[p1]+nums[p2]==0){
                    res.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    while (p1 < p2 && nums[p1]==nums[p1+1]) p1++;
                    p1++;
                }
                else if (nums[i]+nums[p1]+nums[p2]>0) p2--;
                else if (nums[i]+nums[p1]+nums[p2]<0) p1++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        //{-4,-1,-1,0,1,2}
        System.out.println(threeSum(nums));
    }
}

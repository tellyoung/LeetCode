package leetcode.simulation;

import java.util.Arrays;

public class Leetcode283 {
    public static void moveZeroes(int[] nums) {
        int idx = nums.length-1;
        while (nums[idx] == 0 && idx >= 0){
            idx--;
        }
        if (idx < 0) return;

        for (int i = idx-1; i >= 0; i--) {
//            if (i >= idx) break;

            if (nums[i] == 0){
                nums[i] = nums[idx];
                nums[idx] = 0;
                idx--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(nums));
        moveZeroes(nums);

    }
}

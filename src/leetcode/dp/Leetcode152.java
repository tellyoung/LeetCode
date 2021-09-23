package leetcode.dp;

import java.util.Arrays;

public class Leetcode152 {
    public static int maxProduct(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int[] minx = new int[len];
        int[] maxn = new int[len];
        maxn[0] = nums[0];
        minx[0] = nums[0];

        for (int i = 1; i < len; i++) {
            maxn[i] = Math.max(Math.max(nums[i], maxn[i-1]*nums[i]), minx[i-1]*nums[i]);
            minx[i] = Math.min(Math.min(nums[i], maxn[i-1]*nums[i]), minx[i-1]*nums[i]);
            if (maxn[i]>max) max = maxn[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};

        System.out.println(maxProduct(nums));
    }
}

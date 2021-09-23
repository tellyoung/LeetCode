package leetcode.math;

import java.util.Arrays;

public class Leetcode031 {

    public static void nextPermutation(int[] nums) {
        int i, j, flag=0;
        for (i = nums.length-1; i > 0; i--) {
            if (nums[i-1] < nums[i]){
                flag = 1;
                for (j = nums.length-1; j >= i; j--) {
                    if (nums[j] > nums[i-1]) break;
                }
                int temp = nums[j];
                nums[j] = nums[i-1];
                nums[i-1] = temp;
                Arrays.sort(nums, i, nums.length);
                break;
            }
        }
        if (flag == 0) Arrays.sort(nums);
    }

    public static void main(String[] args) {
        int[] n = {1, 2 ,3, 4, 6, 5, 2};
        nextPermutation(n);
        System.out.println(Arrays.toString(n));

    }
}

package leetcode.dp;

public class Leetcode053 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) dp[i] = nums[i];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i], dp[i] + dp[i-1]);
            if (dp[i] > maxSum) maxSum = dp[i];
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

    }
}

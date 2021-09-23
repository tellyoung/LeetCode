package leetcode.dp;

import java.util.Arrays;

public class Leetcode279 {
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) dp[i] = i;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int num = j*j;
                if (num > i) break;
                dp[i] = Math.min(dp[i], dp[i-num] + 1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }
}

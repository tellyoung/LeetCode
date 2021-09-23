package leetcode.dp;

import java.util.Arrays;

public class Leetcode322 {
    public static int coinChange(int[] coins, int amount) {
        if (amount==0) return 0;
        int[] dp = new int[amount+1];
        Arrays.sort(coins);

        for (int j = 0; j < coins.length; j++) {
            if (coins[j] > amount) break;
            int num = coins[j], cnt = 1;
            while (num <= amount){
                if (dp[num] != 0){
                    dp[num] = Math.min(dp[num], cnt);
                } else {
                    dp[num] = cnt;
                }
                num+=coins[j];
                cnt++;
            }
        }

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] > i) break;
                if (dp[i-coins[j]] != 0) {
                    if (dp[i] != 0) dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
                    else dp[i] = dp[i-coins[j]] + 1;
                }


            }
        }
        if (dp[amount] == 0) return -1;
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] nums = {186,419,83,408};

        System.out.println(coinChange(nums, 6249));
    }
}

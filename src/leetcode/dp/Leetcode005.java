package leetcode.dp;

import java.util.Arrays;

public class Leetcode005 {
    public static void main(String[] args) {
        String s = "aacabdkacaa";
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        String max = "";

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        for (int i = len-1; i >= 0; i--){
            for (int j = i; j < len; j++) {
                if (j - i >= 3 && s.charAt(i)==s.charAt(j) && dp[i + 1][j - 1]){//abcd 0123
                    dp[i][j] = true;
                    if (j-i+1>max.length()){
                        max = s.substring(i, j+1);
                    }
                    continue;
                }
                if (j-i<=2 &&j - i >= 1 && s.charAt(i)==s.charAt(j) ){
                    dp[i][j] = true;
                    if (j-i+1>max.length()){
                        max = s.substring(i, j+1);
                    }
                    continue;
                }
                if (i==j){
                    if (1 > max.length()){
                        max = s.substring(i, j+1);
                    }
                }else {
                    dp[i][j] = false;
                }

            }
        }
        System.out.println(max);

    }
}

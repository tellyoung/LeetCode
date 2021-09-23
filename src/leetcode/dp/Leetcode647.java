package leetcode.dp;

public class Leetcode647 {

    public int countSubstrings(String s) {
        char[] c = s.toCharArray();
        int res = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            res++;
        }

        for (int i = s.length()-2; i >= 0; i--) {
            for (int j = i+1; j < s.length(); j++) {
                if (dp[i+1][j-1] || j-i==1){
                    if (c[i] == c[j]){
                        dp[i][j] = true;
                        res++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Leetcode647().countSubstrings("abc"));
    }
}

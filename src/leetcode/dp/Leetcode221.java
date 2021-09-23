package leetcode.dp;

public class Leetcode221 {
    public static int maximalSquare(char[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int res = 0;
        int[][] dp = new int[n][m];
        for (int i = 0; i < m; i++) {
            dp[0][i] = Integer.parseInt(String.valueOf(matrix[0][i]));
            if(matrix[0][i]=='1' && res<1) res = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[i][0] = Integer.parseInt(String.valueOf(matrix[i][0]));
            if(matrix[i][0]=='1' && res<1) res = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i-1][j-1]), dp[i][j-1])+1;
                }else {
                    dp[i][j] = 0;
                }
                if (dp[i][j] > res) res = dp[i][j];
            }
        }
        return res*res;
    }

    public static void main(String[] args) {
        char[][] matrix =  {{'1', '0', '1', '0', '0'},
                            {'1', '0', '1', '1', '1'},
                            {'1', '1', '1', '1', '1'},
                            {'1', '0', '0', '1', '0'}};

        System.out.println(maximalSquare(matrix));
    }
}

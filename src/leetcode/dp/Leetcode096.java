package leetcode.dp;

public class Leetcode096 {
    public static int numTrees(int n) {
        int[] G = new int[n+1]; // 1...n-1
        if(n == 1) return 1;
        G[0] = 1;
        G[1] = 1;
        G[2] = 2;

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                G[i] += G[j-1]*G[i-j];
            }
        }
        return G[n];
    }

    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }
}

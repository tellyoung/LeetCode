package examination.wangyi;

import java.util.Scanner;

public class L01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int[][] num = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int d = sc.nextInt();
                num[i][j] = d;
            }
        }
        int[] r1 = new int[101];
        int[] r2 = new int[101];
        int[] c1 = new int[101];
        int[] c2 = new int[101];
        int[] s = new int[101];
        int[] A = new int[101];
        for (int i = 0; i < T; i++) {
            r1[i] = sc.nextInt();
            r2[i] = sc.nextInt();
            c1[i] = sc.nextInt();
            c2[i] = sc.nextInt();
            s[i] = sc.nextInt();
            A[i] = sc.nextInt();
        }
        for (int l = 0; l < T; l++) {
            for (int i = r1[l]-1; i <= r2[l]-2; i++) {
                for (int j = i; j <= r2[l]-2; j++) {
                    if (A[l]==0 && num[j][s[l]-1] > num[j+1][s[l]-1]){
                        for (int k = c1[l]-1; k < c2[l]; k++) {
                            int temp = num[j][k];
                            num[j][k] = num[j+1][k];
                            num[j+1][k] = temp;
                        }
                        if (s[l]-1>=c2[l]||s[l]-1<c1[l]-1){
                            int temp = num[j][s[l]-1];
                            num[j][s[l]-1] = num[j+1][s[l]-1];
                            num[j+1][s[l]-1] = temp;
                        }
                    }
                    if (A[l]==1 && num[j][s[l]-1] < num[j+1][s[l]-1]){
                        for (int k = c1[l]-1; k < c2[l]; k++) {
                            int temp = num[j][k];
                            num[j][k] = num[j+1][k];
                            num[j+1][k] = temp;
                        }
                        if (s[l]-1>=c2[l]||s[l]-1<c1[l]-1){
                            int temp = num[j][s[l]-1];
                            num[j][s[l]-1] = num[j+1][s[l]-1];
                            num[j+1][s[l]-1] = temp;
                        }
                    }
                }
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(num[i][j]+" ");
            }
            if (i!=N-1) System.out.println("");
        }
    }
}

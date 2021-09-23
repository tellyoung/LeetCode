package container.common;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] a = new int[20];
        int[][] b = new int[5][10];
        int[] c = {1, 2, 3, 4, 8, 9, 0};
        int[][] d = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(d[1][0]);
        Arrays.sort(c);
        for (int i : c) {
            System.out.print(i);
        }
    }
}

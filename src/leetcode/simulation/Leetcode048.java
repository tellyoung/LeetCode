package leetcode.simulation;

import java.util.Arrays;

public class Leetcode048 {
    public static void rotate(int[][] matrix) {
        int len = matrix.length-1, len_part1 = matrix.length / 2;
        int len_part2 = len_part1;
        if (matrix.length % 2 == 1) len_part1++;

        int temp1, temp2;
        for (int i = 0; i < len_part1; i++) {
            for (int j = 0; j < len_part2; j++) {
                // len=2
                // 01 12
                //1 2 3 4 5
                //1 2 3 4 5
                //1 2 3 4 5
                //1 2 3 4 5
                //1 2 3 4 5
                temp1 = matrix[j][len-i];
                matrix[j][len-i] = matrix[i][j];

                temp2 = matrix[len-i][len-j];
                matrix[len-i][len-j] = temp1;

                temp1 = matrix[len-j][i];
                matrix[len-j][i] = temp2;

                matrix[i][j] = temp1;
            }
        }
    }

    public static void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
//        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10},{13, 3, 6, 7},{15, 14, 12, 16}};
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        print(matrix);
        rotate(matrix);
        print(matrix);

    }
}

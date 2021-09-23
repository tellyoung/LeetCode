package leetcode.math;

import java.util.Arrays;

public class Leetcode338 {

    public static int[] countBits(int num) {
        int[] res = new int[num+1];

        for (int i = 0; i <= num; i++) {
            String str = Integer.toString(i, 2);
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)=='1'){
                    cnt++;
                }
            }
            res[i] = cnt;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

}

package leetcode.math;

public class Leetcode461 {
    public static int hammingDistance(int x, int y) {
        String sx = Integer.toString(x, 2);
        String sy = Integer.toString(y, 2);

        int cnt = 0;
        int ix = sx.length()-1, iy = sy.length()-1;
        while (ix>=0&&iy>=0){
            if (sx.charAt(ix) != sy.charAt(iy)) cnt++;
            ix--;
            iy--;
        }
        while (ix>=0){
            if (sx.charAt(ix)=='1') cnt++;
            ix--;
        }
        while (iy>=0){
            if (sy.charAt(iy)=='1') cnt++;
            iy--;
        }

        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));;
    }
}

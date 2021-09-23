package leetcode.doublepointer;

public class Leetcode011 {
    public static int maxArea(int[] height) {
        int p1=0, p2=height.length-1;
        int maxV = 0;
        while (p1 < p2) {
            int h = Math.min(height[p1], height[p2]);
            maxV = Math.max(maxV, h * (p2 - p1));
            if (height[p1] > height[p2]) {
                p2--;
            } else {
                p1++;
            }
        }
        return maxV;
    }

    public static void main(String[] args) {
        int[] n = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(n));;
    }
}

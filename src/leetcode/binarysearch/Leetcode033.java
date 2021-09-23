package leetcode.binarysearch;

public class Leetcode033 {
    public static int search(int[] nums, int target) {
        int id=0, l=0, r=nums.length-1, mid = 0;

        while (l <= r){
            mid = (l+r)/2;
            if (nums[mid] == target) return mid;
            if (nums[r] < target){
                if (nums[mid] > nums[r] && target > nums[mid]){
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }else {
                if (nums[mid] < nums[r] && target < nums[mid]){
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {4,5,6,7,0,1,2};
        for (int i = 0; i < num.length; i++) {
            System.out.println(search(num, num[i]));
        }
    }
}

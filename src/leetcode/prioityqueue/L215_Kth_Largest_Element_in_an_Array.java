package leetcode.prioityqueue;

import java.util.PriorityQueue;

public class L215_Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> stack = new PriorityQueue<Integer>();
        int result = 0;
        for (int num : nums) {
            stack.add((-1) * num);
        }
        for (int i = 0; i < k; i++) {
            result = stack.poll();
        }
        return (-1) * result;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 8, 1, 2};
        int res = new L215_Kth_Largest_Element_in_an_Array().findKthLargest(a, 1);
        System.out.println(res);
    }
}

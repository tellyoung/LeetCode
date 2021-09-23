package leetcode.prioityqueue;

import java.util.*;

public class L347_Top_K_Frequent_Elements {

    public static class Solution {

        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
            for (int num : nums) {
                hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            }

            // int[] 的第一个元素代表数组的值，第二个元素代表了该值出现的次数
            PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
                public int compare(int[] m, int[] n) {
                    return m[1] - n[1];
                }
            });
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                int num = entry.getKey(), count = entry.getValue();
                if (queue.size() == k) {
                    if (queue.peek()[1] < count) {
                        queue.poll();
                        queue.offer(new int[]{num, count});
                    }
                } else {
                    queue.offer(new int[]{num, count});
                }
            }
            int[] ret = new int[k];
            for (int i = 0; i < k; ++i) {
                ret[i] = queue.poll()[0];
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        Solution my = new Solution();
        int[] res = my.topKFrequent(new int[]{2, 3, 4, 0, 8, 9, 7, 5}, 3);
        System.out.println(Arrays.toString(res));
    }


}

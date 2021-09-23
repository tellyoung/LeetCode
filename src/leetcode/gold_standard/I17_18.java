package leetcode.gold_standard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class I17_18 {

    public static int[] shortestSeq(int[] big, int[] small) {
        int start = 0, end = 0;
        int[] res = new int[2];
        int minx = Integer.MAX_VALUE;
        HashSet<Integer> origin = new HashSet<>();
        HashMap<Integer, Integer> cur = new HashMap<>();
        for (int i = 0; i < small.length; i++) origin.add(small[i]);

        while (start <= end){
            while (cur.size() == origin.size()){
                if (end - start < minx){
                    minx = end - start;
                    res[0] = start;
                    res[1] = end-1;
                }
                if (cur.containsKey(big[start])){
                    int tmp = cur.get(big[start])-1;
                    if (tmp <= 0) cur.remove(big[start]);
                    else cur.put(big[start], tmp);
                }
                start++;
            }
            if (end == big.length) break;
            if (origin.contains(big[end])){
                if (!cur.containsKey(big[end])) cur.put(big[end], 1);
                else cur.put(big[end],cur.get(big[end])+1);
            }
            end++;
        }
        if (res[0]==0&&res[1]==0) return new int[0];
        return res;

    }

    public static void main(String[] args) {
        int[] n = {7,5,9};
        int[] small = {7,5,9};
        System.out.println(Arrays.toString(shortestSeq(n, small)));

    }
}

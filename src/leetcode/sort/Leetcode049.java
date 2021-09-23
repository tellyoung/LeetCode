package leetcode.sort;

import java.util.*;

public class Leetcode049 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, Integer> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        int idx = 0;

        for (String str: strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String tmp = String.valueOf(c);
//            System.out.println(tmp);
            if (!map.containsKey(tmp)){
                map.put(tmp, idx);
                res.add(new ArrayList<String>());
                idx++;
            }
            res.get(map.get(tmp)).add(str);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}

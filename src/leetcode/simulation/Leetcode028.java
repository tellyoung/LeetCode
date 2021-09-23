package leetcode.simulation;

import java.util.Arrays;

public class Leetcode028 {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            int j;
            if (haystack.charAt(i) == needle.charAt(0)){
                for (j = 1; j < needle.length(); j++) {
                    if (i+j >= haystack.length()) break;
                    if (haystack.charAt(i+j) != needle.charAt(j)) break;
                }
                if (j >= needle.length()) return i;
            }
        }
        return -1;
    }

    // KMP 算法
    //
    public static int strStr_KMP(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int[] next = new int[needle.length()];
        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        int pre = 0;


        for (int i = 1; i < need.length; i++) {
            while (pre > 0 && need[pre] != need[i]){
                pre = next[pre-1];
                // aaca b aaca
                // aaca b aacaa
            }
            if (need[pre] == need[i]){
                pre++;
            }
            next[i] = pre;
        }
        System.out.println(Arrays.toString(next));

        int i = 0, j = 0;
        while (i < hay.length){
            if (hay[i] == need[j]){
                i++;
                j++;
                if (j >= need.length) return i - need.length;
            }else {
                if (j - 1 != -1) i = i - next[j-1];
                else i++;
                j = 0;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(strStr_KMP("aabaaabaaac", "aabaaac"));
//        "aabaaabaaac"
//        "aabaaac"

    }
}

package leetcode.recall_dfs;

import java.util.ArrayList;
import java.util.List;

public class Leetcode017 {
    static String[] temp = {"","","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        boolean[] used = new boolean[digits.length()];
        StringBuilder path = new StringBuilder();
        dfs(temp, res, digits, path, 0);
        return res;
    }

    private static void dfs(String[] temp, List<String> res, String digits, StringBuilder path, int depth){
        if (path.length()==digits.length()){
            res.add(path.toString());
            return;
        }
        int id = Character.getNumericValue(digits.charAt(depth));
        for (int j = 0; j < temp[id].length(); j++) {
            path.append(temp[id].charAt(j));
            dfs(temp, res, digits, path, depth+1);
            path.deleteCharAt(path.length()-1);
        }
    }


    public static void main(String[] args) {
        String s = "23";
        System.out.println(letterCombinations(s));;

    }
}

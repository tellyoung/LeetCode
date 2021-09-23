package leetcode.recall_dfs;

import java.util.ArrayList;
import java.util.List;

public class Leetcode022 {
    char[] c = {'(', ')'};

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        dfs(n, 0, 0, res, str);

        return res;

    }

    public void dfs(int n, int l, int r, List<String> res, StringBuilder str){
        if (r>l) return;
        if (l>n||r>n) return;
        if (n==l && l==r){
            res.add(str.toString());
            return;
        }

        for (int i = 0; i < c.length; i++) {
            if (i==0){
                str.append(c[i]);
                dfs(n, l+1, r, res, str);
                str.deleteCharAt(str.length()-1);
            }else {
                str.append(c[i]);
                dfs(n, l, r+1, res, str);
                str.deleteCharAt(str.length()-1);
            }
        }
    }


    public static void main(String[] args) {
        Leetcode022 lt = new Leetcode022();

        System.out.println(lt.generateParenthesis(3));
    }


}

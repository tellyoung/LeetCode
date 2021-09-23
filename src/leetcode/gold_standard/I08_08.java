package leetcode.gold_standard;

import java.util.ArrayList;
import java.util.Arrays;

public class I08_08 {
    public String[] permutation(String S) {
        char[] c = S.toCharArray();
        ArrayList<String> res = new ArrayList<>();
        boolean[] used = new boolean[S.length()];
        String path = "";

        Arrays.sort(c);

        func(c, used, path, res);
        String[] op = new String[res.size()];
        res.toArray(op);

        return op;
    }

    public void func(char[] c, boolean[] used, String path, ArrayList<String> res){
        if (path.length() == c.length){
            res.add(new String(path));
        }

        for (int i = 0; i < c.length; i++) {
            if (i>0 && used[i-1] && c[i-1]==c[i]) continue;
            if (!used[i]){
                path += c[i];
                used[i] = true;
                func(c, used, path, res);
                used[i] = false;
                path = path.substring(0, path.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new I08_08().permutation("qqe")));
    }
}

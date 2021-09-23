package leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode020 {

    public boolean isValid(String s) {
        HashMap<Character, Character> hash = new HashMap<>();
        ArrayList<Character> array = new ArrayList<>();
        hash.put(')','(');
        hash.put(']','[');
        hash.put('}','{');

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!hash.containsKey(cur)){
                array.add(cur);
            }else {
                if (array.isEmpty()){
                    return false;
                }
                if (array.get(array.size()-1) != hash.get(cur)){
                    return false;
                }

                array.remove(array.size()-1);
            }
        }
        if (array.isEmpty()) return true;
        return false;
    }


}

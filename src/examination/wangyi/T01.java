package examination.wangyi;

import java.util.*;

public class T01 {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i < n ; i++){
            String tb = sc.next();
            String user = sc.next();
            if (!map.containsKey(user)) {
                map.put(user, new HashSet<String>());
                map.get(user).add(tb);
            }
            else{
                map.get(user).add(tb);
            }
        }

        HashMap<String, Integer> cnt = new HashMap<>();
        for (String user:map.keySet()) {
            Object[] s = map.get(user).toArray();
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s.length; j++) {
                    if(i!=j){
                        String h = String.valueOf((String)s[i]+" "+s[j]);
                        if (cnt.containsKey(h)){
                            cnt.put(h, cnt.get(h)+1);
                        }else {
                            cnt.put(h, 1);
                        }
                    }
                }
            }
        }
        List<String> list = new ArrayList<>();

        for (String k: cnt.keySet()) {
            if (cnt.get(k)>2){
                list.add(k+" "+cnt.get(k));

            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

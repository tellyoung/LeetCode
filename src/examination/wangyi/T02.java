package examination.wangyi;

import java.util.HashSet;
import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String s = sc.next();
            int cnt = N, id = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < N; j++) {
                set.add(j);
            }
            while (cnt>1 && M>0){
                id=0;
                Object[] o = set.toArray();
                for (int j = id+1; j < o.length; j++) {
                    if (j==id) continue;
                    if (s.charAt((int)o[j])==s.charAt((int)o[id])){
                        id=j;
                    }
                    if (s.charAt((int)o[j])=='R'&& s.charAt((int)o[id])=='S'){
                        set.remove((int)o[id]);
                        id=j+1;
                    }
                    if (s.charAt((int)o[j])=='R'&& s.charAt((int)o[id])=='C'){
                        set.remove((int)o[id]);
                        id=j+1;
                    }
                    if (s.charAt((int)o[j])=='R'&& s.charAt((int)o[id])=='S'){
                        set.remove((int)o[id]);
                        id=j+1;
                    }
                }

                M--;
            }
        }
    }
}

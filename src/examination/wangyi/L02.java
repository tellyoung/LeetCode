package examination.wangyi;

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class L02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int R = sc.nextInt();

        ArrayList<HashMap<Integer, HashMap<Character, Integer>>> array= new ArrayList<>();
        array.add(new HashMap<Integer, HashMap<Character, Integer>>());
        int K = sc.nextInt();
        int[][] start = new int[K+1][2];
        for (int i = 1; i <= K; i++) {
            start[i][0] = sc.nextInt();
            start[i][1] = sc.nextInt();
            array.add(new HashMap<Integer, HashMap<Character, Integer>>());
        }

        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {
            int P = sc.nextInt();
            int T = sc.nextInt();
            int dis = sc.nextInt();
            String S = sc.next();

            array.get(P).put(T, new HashMap<>());
            array.get(P).get(T).put(S.charAt(0), dis);
        }

        int maxt = Integer.MIN_VALUE;
        int D = sc.nextInt();
        int[] time = new int[D];
        for (int i = 0; i < D; i++) {
            time[i] = sc.nextInt();
            if (time[i] > maxt) maxt = time[i];
        }

        int[] res = new int[maxt+1];

        for (int i = 0; i <= maxt; i++) {
            int cnt = 0;
            for (int j = 1; j <= K; j++) {
                if (array.get(j).containsKey(i)){

                    if (array.get(j).get(i).containsKey('W')) start[j][1]+=array.get(j).get(i).get('W');
                    if (array.get(j).get(i).containsKey('S')) {
                        start[j][1] -= array.get(j).get(i).get('S');

                    }
                    if (array.get(j).get(i).containsKey('A')) start[j][0]-=array.get(j).get(i).get('A');
                    if (array.get(j).get(i).containsKey('D')) start[j][0]+=array.get(j).get(i).get('D');

                    if (start[j][0]>=X-R-0.5&&start[j][0]<=X+R+0.5&&start[j][1]<=Y+R+0.5&&start[j][1]>=Y-R-0.5){
                        cnt++;
                    }
                    if (start[j][0]>M) start[j][0] = M;
                    if (start[j][1]>N) start[j][1] = N;
                }
            }
            res[i] = cnt;
        }

        for (int i = 0; i < D; i++) {
            System.out.print(res[time[i]]+" ");
        }
    }


}

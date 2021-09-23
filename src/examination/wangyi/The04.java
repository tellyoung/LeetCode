package examination.wangyi;

import java.util.ArrayList;

public class The04 {
    int max=0;
    public int mostGold (int power, int nodeNum, int[][] graph) {
        // write code here
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < g.size(); i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < graph.length; i++) {
            g.get(graph[i][0]).add(graph[i][1]);
        }
        boolean[] used = new boolean[nodeNum];
        dfs(power, 0, g, used, 0);
        return max;
    }

    public void dfs(int power, int now, ArrayList<ArrayList<Integer>> g, boolean[] used, int sum){
        if (power==0){
            return;
        }
        for (int i = 0; i < g.get(now).size(); i++) {
            if (used[i]) sum++;
            if (sum>max) max=sum;
            used[i] = true;
            dfs(power-1, g.get(now).get(i),g, used, sum);
        }

    }
}

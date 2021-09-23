package leetcode.recall_dfs;

public class Leetcode200 {
    int num = 0;
    boolean flag = false;
    int[][] step = {{0,0}, {1, 0}, {-1, 0}, {0, -1}, {0, 1}};
    public int numIslands(char[][] grid) {
        boolean[][] used = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                flag = false;
                if (!used[i][j]&&grid[i][j]=='1')
                    dfs(i, j, grid, used);
                if (flag){
                    num++;
                }
            }
        }
        return num;
    }

    public void dfs(int a, int b, char[][] grid, boolean[][] used){

        for (int i = 0; i < step.length; i++) {
            if (a+step[i][0]<0||b+step[i][1]<0||a+step[i][0]>= grid.length||b+step[i][1]>=grid[0].length) continue;
            if (!used[a+step[i][0]][b+step[i][1]]&&grid[a+step[i][0]][b+step[i][1]]=='1'){
                used[a+step[i][0]][b+step[i][1]] = true;
                flag = true;
                dfs(a+step[i][0], b+step[i][1], grid, used);
            }
        }

    }

    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '0', '0', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '1', '0', '0'},
                        {'0', '0', '0', '1', '1'}};
        System.out.println(new Leetcode200().numIslands(grid));

    }
}

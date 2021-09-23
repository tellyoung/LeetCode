package leetcode.recall_dfs;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode079 {
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static boolean flag = false;

    public boolean exist(char[][] board, String word) {
        boolean[][] used= new boolean[board.length][board[0].length];
        StringBuilder path = new StringBuilder();
//        boolean flag = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                used[i][j] = true;
                path.append(board[i][j]);
                dfs(i, j, board, path, used, word);
                used[i][j] = false;
                path.deleteCharAt(0);
            }
        }
        return flag;
    }
    private void dfs(int i, int j, char[][] board, StringBuilder path, boolean[][] used, String target){
        String s = path.toString();
        if (s.length()>target.length() || !target.substring(0,s.length()).equals(s)) return;

        if (target.equals(String.valueOf(path))){
            this.flag = true;
            return;
        }

        for (int k = 0; k < directions.length; k++) {
            if (flag) break;
            int x = i + directions[k][0], y = j + directions[k][1];
            if (x<0||x>=board.length||y<0||y>=board[0].length) continue;
            if (used[x][y]) continue;
            used[x][y] = true;
            path.append(board[x][y]);
            dfs(x, y, board, path, used, target);
            used[x][y] = false;
            path.deleteCharAt(path.length()-1);
        }

    }

    public static void main(String[] args) {
        Leetcode079 lt = new Leetcode079();
        char[][] board = {{'A', 'B', 'C', 'E'},
                          {'S', 'F', 'C', 'S'},
                          {'A', 'D', 'E', 'E'}};
        System.out.println(lt.exist(board,"ABCB"));

    }
}

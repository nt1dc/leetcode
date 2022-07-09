import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Number_of_Islands {
    class Solution {
        public int numIslands(char[][] grid) {
            int r = grid.length;
            int c = grid[0].length;
            boolean[][] bol = new boolean[r][c];
            int count = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (!bol[i][j] && grid[i][j] != '0' && dfs(grid, bol, i, j)) count++;
                }
            }
            return count;
        }

        public boolean dfs(char[][] c, boolean[][] n, int i, int j) {
            if (i < 0 || i >= c.length || j < 0 || j >= c[0].length) {
                return true;
            } else if (c[i][j] == '0' || n[i][j]) {
                return true;
            }
            n[i][j] = true;
            if (dfs(c, n, i+1, j) && dfs(c, n, i-1, j) && dfs(c, n, i, j+1) && dfs(c, n, i, j-1)) {
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {

    }
}

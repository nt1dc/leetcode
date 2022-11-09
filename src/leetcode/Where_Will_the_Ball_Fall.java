package leetcode;

public class Where_Will_the_Ball_Fall {
    class Solution {
        public int[] findBall(int[][] grid) {
            int[] ans = new int[grid[0].length];
            for (int i = 0; i < grid[0].length; i++) {
                ans[i] = dfs(0, i, grid);
            }
            return ans;
        }

        private int dfs(int x, int y, int[][] arr) {
            if (x == arr.length) return y;
            if (arr[x][y] == 1) {
                if (y + 1 == arr[0].length || arr[x][y] != arr[x][y + 1]) return -1;
                return dfs(x + 1, y + 1, arr);
            } else {
                if (y - 1 < 0 || arr[x][y] != arr[x][y - 1]) return -1;
                return dfs(x + 1, y - 1, arr);
            }

        }
    }
}

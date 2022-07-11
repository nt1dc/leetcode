public class Search_a_2D_Matrix {
    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
//            find row
                int l = 0;
                int r = matrix.length;
                if (matrix.length > 1) {
                    while (l < r) {
                        int m = l + (r - l) / 2;
                        if (matrix[m][0] == target) return true;
                        if (matrix[m][0] < target) {
                            l = m+1;
                        } else r = m - 1;
                    }
                }


                int L = 0;
                int R = matrix[l].length - 1;
                while (L <= R) {
                    int m = L + (R - L) / 2;
                    if (matrix[l][m] == target) return true;
                    if (matrix[l][m] < target) L = m + 1;
                    else R = m - 1;
                }
                return false;
        }


    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.searchMatrix(new int[][]{{1},{3}}, 4));


        System.out.println(solution.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
    }
}

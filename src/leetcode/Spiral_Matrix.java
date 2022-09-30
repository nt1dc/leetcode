package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int rows = matrix.length;
            int columns = matrix[0].length;
            List<Integer> ans = new ArrayList<>();
            int leftBound = 0;
            int rightBound = matrix[0].length - 1;
            int upperBound = 0;
            int lowerBound = matrix.length - 1;
            while (ans.size() < rows * columns) {
                for (int i = leftBound; i <= rightBound &&ans.size() < rows * columns; i++) {
                    ans.add(matrix[upperBound][i]);
                }
                upperBound++;

                for (int i = upperBound; i <= lowerBound &&ans.size() < rows * columns; i++) {
                    ans.add(matrix[i][rightBound]);
                }
                rightBound--;
                for (int i = rightBound; i >= leftBound &&ans.size() < rows * columns; i--) {
                    ans.add(matrix[lowerBound][i]);
                }
                lowerBound--;

                for (int i = lowerBound; i >= upperBound&&ans.size() < rows * columns; i--) {
                    ans.add(matrix[i][leftBound]);
                }
                leftBound++;

            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[][] x = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        Solution solution = new Solution();
        solution.spiralOrder(x);
    }
}

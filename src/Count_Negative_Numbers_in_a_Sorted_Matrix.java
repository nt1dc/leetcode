public class Count_Negative_Numbers_in_a_Sorted_Matrix {
    static class Solution {
        public int countNegatives(int[][] grid) {
            int count = 0;
            for (int[] ints : grid) {
                int l = 0;
                int r = ints.length - 1;
                while (l < r) {
                    int m = l + (r - l) / 2;
                    if (ints[m] >= 0) {
                        l = m + 1;
                    } else {
                        count += (r - m) + 1;
                    }
                }

            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countNegatives(new int[][]{{3, 2}, {1, 0}});


        solution.countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}});

    }
}

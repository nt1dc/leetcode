//  135. Candy
//https://leetcode.com/problems/candy/

import java.util.Arrays;

public class Candy {
    static class Solution {
        public int candy(int[] ratings) {
            int[] candies = new int[ratings.length];
            Arrays.fill(candies, 1);

            for (int i = 0; i < ratings.length-1; i++) {
                if (ratings[i] < ratings[i + 1]) {
                    candies[i + 1] = candies[i] + 1;
                }
            }

            for (int i = ratings.length-1; i >= 1; i--) {
                if (ratings[i] < ratings[i - 1]) {
                    candies[i - 1] = Math.max(candies[i - 1], candies[i] + 1);
                }
            }
            int sum = 0 ;
            for (int i = 0; i <ratings.length; i++) {
                sum+=candies[i];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.candy(new int[]{1, 0, 2}));

    }
}

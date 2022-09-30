package leetcode;

public class Container_With_Most_Water {
    static class Solution {
        public int maxArea(int[] height) {
            int l = 0;
            int r = height.length - 1;
            int max = 0;
            boolean right=true;

            while (l < r) {
                max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
                if(height[r]>=height[l])l++;
                else r--;
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}

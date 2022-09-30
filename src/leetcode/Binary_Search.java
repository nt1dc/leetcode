package leetcode;

public class Binary_Search {
    static class Solution {
        public int search(int[] nums, int target) {
            int l = 0;
            int r = nums.length - 1;
            int m = l + (r - l) / 2;
            while (l <= r) {
                if (nums[m] == target) return m;
                if (nums[m] > target) r = m - 1;
                else l = m + 1;
                m = l + (r - l) / 2;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assert (solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9) == 0);
    }
}

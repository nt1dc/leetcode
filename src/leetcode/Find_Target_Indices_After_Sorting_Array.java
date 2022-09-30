package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Target_Indices_After_Sorting_Array {
    static class Solution {
        public List<Integer> targetIndices(int[] nums, int target) {
            Arrays.sort(nums);
            int l = 0;
            int r = nums.length - 1;
            List<Integer> ans = new ArrayList<>();
            while (l < r) {
                int m = l + (r - l) / 2;
                if (nums[m] < target) {
                    l = m + 1;
                } else r = m;
            }
            while (l<nums.length-1&&nums[l] == target ) {
                ans.add(l);
                l++;
            }
            return ans;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            solution.targetIndices(new int[]{1, 2, 5, 2, 3}, 2);
        }
    }
}

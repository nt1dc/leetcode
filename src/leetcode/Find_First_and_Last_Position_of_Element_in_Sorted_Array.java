package leetcode;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    static class Solution {
//    todo: доделать а то ч как лох
        public int[] searchRange(int[] nums, int target) {
            int l = 0;
            int r = nums.length;
            int m = 0;
            int[] ans = new int[2];
            while (l < r) {
                m = (l + r) / 2;
                if (m == target) {
                    int ansr = m;
                    while (ansr < nums.length - 1) {
                        if (nums[ansr] == nums[m]) ansr++;
                        else break;
                    }
                    int ansl = m;
                    while (ansl > 0) {
                        if (nums[ansl] == nums[m]) ansl--;
                        else break;
                    }
                    ans[0] = ansl;
                    ans[1] = ansr;
                    return ans;
                }
                if (m > l) {
                    l = m;
                } else {
                    r = m;
                }
            }
            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(new int[]{1}, 1)));
    }
}

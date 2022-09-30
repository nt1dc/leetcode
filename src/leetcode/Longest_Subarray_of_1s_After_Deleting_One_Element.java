package leetcode;

public class Longest_Subarray_of_1s_After_Deleting_One_Element {
    class Solution {
        public int longestSubarray(int[] nums) {
            int len = 0;

            int start = -1;
            int ind = -1;

            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) {
                    start = ind;
                    ind = i;
                }
                len = Math.max(len, i - start - 1); // doing - 1 because we need to remove one element
            }
            return len;
        }
    }

    public static void main(String[] args) {

    }
}

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Remove_Duplicates_from_Sorted_Array {
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0;
            int j = 1;

            while(j < nums.length){
                if(nums[i] != nums[j]){
                    i++;
                    nums[i] = nums[j];
                }else {
                    j++;
                }
            }
            return i+1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.removeDuplicates(new int[]{1, 1, 2});

    }
}

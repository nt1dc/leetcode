package leetcode;

import java.util.HashSet;

//217. Contains Duplicate
//https://leetcode.com/problems/contains-duplicate/
public class Contains_Duplicate {
    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) return true;
                else set.add(num);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}

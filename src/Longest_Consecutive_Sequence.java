import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//128. Longest Consecutive Sequence
//https://leetcode.com/problems/longest-consecutive-sequence/
public class Longest_Consecutive_Sequence {
    // TODO: 7/6/2022 sdelat
    static class Solution {
        public int longestConsecutive(int[] nums) {
            Set set = new HashSet();
            Collections.addAll(set, nums);
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
    }
}

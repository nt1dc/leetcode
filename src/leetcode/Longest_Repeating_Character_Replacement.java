package leetcode;

import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {
    // TODO: 7/9/2022
    class Solution {
        public int characterReplacement(String s, int k) {
            int[] arr = new int[26];
            int ans = 0;
            int max = 0;
            int start = 0;
            for (int end = 0; end < s.length(); end++) {
                arr[s.charAt(end) - 'A']++;
                max = Math.max(max, arr[s.charAt(end) - 'A']);
                if (end - start + 1 - max > k) {
                    arr[s.charAt(start) - 'A']--;
                    start++;
                }
                ans = Math.max(ans, end - start + 1);
            }
            return ans;
        }
    }

    public static void main(String[] args) {

    }
}

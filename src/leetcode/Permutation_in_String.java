package leetcode;

public class Permutation_in_String {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int end = 0;
            int start = 0;
            while (end < s2.length()) {
                if (s1.contains(String.valueOf(s2.charAt(end)))) {
                    end++;
                } else {
                    start++;
                }
            }
            return true;
        }
    }
}

package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> arr = new HashMap<>();
            int start = 0;
            int end = 0;
            int max = 0;
            if (s.length()==1)return 1;
            while (end < s.length()) {
                char charter = s.charAt(end);
                if (arr.get(charter) != null&& start<=arr.get(charter)) {
                    start = arr.get(charter) + 1;
                }
                arr.put(charter, end);
                max = Math.max(max, end - start+1);
                end++;
            }
            return max;
        }
//        abba
//            abcabcbb
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(
                "abba"

        ));
    }
}

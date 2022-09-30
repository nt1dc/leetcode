package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> set = new HashSet<>();
            int left = 0;
            int ans = 0;
            for (int right = 0; right < s.length(); right++) {
                    while (set.contains(s.charAt(right))) {
                        set.remove(s.charAt(left));
                        left++;
                }
                set.add(s.charAt(right));
                ans = Math.max(ans, right - left + 1);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("acceb"
        ));
    }
}

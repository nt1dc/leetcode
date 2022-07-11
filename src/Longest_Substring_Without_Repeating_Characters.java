import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int maxCount = 0;
            int count = 0;
            HashMap<Character, Integer> hashMap = new HashMap();
            for (int i = 0; i < s.length(); i++) {
                if (hashMap.containsKey(s.charAt(i))) {
                    count = 1;
                    i = hashMap.get(s.charAt(i)) + 1;
                    hashMap.clear();
                } else count++;
                hashMap.put(s.charAt(i), i);
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            return maxCount;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}

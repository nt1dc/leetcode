//392. Is Subsequence
//https://leetcode.com/problems/is-subsequence/

public class Is_Subsequence {


    static class Solution {
        public boolean isSubsequence(String s, String t) {
            if (s.length() > t.length()) return false;
            if (s.length() == 0) {
                return true;
            }
            int j = 0;
            for (int i = 0; i < t.length(); i++) {
                if (s.charAt(j) == t.charAt(i)) {
                    j++;
                    if (j == s.length()) return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("axc", "ahbgdc"));
    }
}

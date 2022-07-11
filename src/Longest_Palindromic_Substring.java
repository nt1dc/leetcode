public class Longest_Palindromic_Substring {
    static class Solution {
        public String longestPalindrome(String s) {
            int maxLen = 0;
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                int r, l;
                if (s.length() % 2 == 1) {
                    l = i;
                    r = i;
                } else {
                    l = i;
                    r = i + 1;
                }
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    if ((r - l + 1) > maxLen) {
                        ans = s.substring(l, r+1);
                        maxLen = r - l + 1;
                    }
                    l--;
                    r++;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.longestPalindrome("babad");
    }
}

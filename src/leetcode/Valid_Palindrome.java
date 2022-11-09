package leetcode;

public class Valid_Palindrome {
    static class Solution {
        public boolean isPalindrome(String s) {
            String s1 = s.toLowerCase();
            int l = 0;
            int r = s1.length() - 1;
            while (l < r) {
                if (Character.isLetterOrDigit(s1.charAt(l))) {
                    l++;
                }
                if (Character.isLetterOrDigit(s1.charAt(r))) {
                    r--;
                }
                if (s1.charAt(l) != s1.charAt(r)) return false;
                l++;
                r--;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("0P"));

    }
}

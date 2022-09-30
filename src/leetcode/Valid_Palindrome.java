package leetcode;

public class Valid_Palindrome {
    static class Solution {
        public boolean isPalindrome(String s) {
            s = s.toLowerCase();
            int l = 0;
            int r = s.length() - 1;
            while (l < r) {
                char lChar = s.charAt(l);
                char rChar = s.charAt(r);
                if (!Character.isLetterOrDigit(lChar)) {
                    l++;
                    continue;
                }
                if (!Character.isLetterOrDigit(rChar)) {
                    r--;
                    continue;
                }
                if (lChar != rChar) {
                    return false;
                }
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

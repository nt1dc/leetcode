package leetcode;

public class Valid_Palindrome_II {
    // TODO: 9/30/2022
    static class Solution {
        public boolean validPalindrome(String s) {
            int l = 0;
            int r = s.length() - 1;
            int count = 0;
            boolean right = true;
            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) {
                    if (count >= 1) return false;
                    if (s.charAt(l + 1) == s.charAt(r)) l++;
                    else if (s.charAt(l) == s.charAt(r - 1)) r--;
                    else return false;
                    count++;
                }
                if (right) {
                    r--;
                    right = false;
                }else {
                    l++;
                    right=true;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}

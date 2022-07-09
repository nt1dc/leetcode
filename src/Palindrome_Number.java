//9
//https://leetcode.com/problems/palindrome-number/
public class Palindrome_Number {
    static class Solution {
        public boolean isPalindrome(int x) {
            String s = String.valueOf(x);
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) == s.charAt(s.length()-1 - i)) {

                } else {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution =new Solution();
        System.out.println(solution.isPalindrome(1321));
    }

}

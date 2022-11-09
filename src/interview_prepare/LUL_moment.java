package interview_prepare;

public class LUL_moment {
    class Solution {
        char fun(String s) {
            int max = 0;
            char res = 0;
            int[] alph = new int[26];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int i1 = ++alph[c - 'a'];
                if (i1 > max) {
                    max = i1;
                    res = c;
                }
            }
            return res;
        }
    }
}

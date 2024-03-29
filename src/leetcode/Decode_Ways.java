package leetcode;

public class Decode_Ways {
    class Solution {

        private int numDecodings(int p, String s) {
            int n = s.length();
            if (p == n) return 1;
            if (s.charAt(p) == '0') return 0;
            int res = numDecodings(p + 1, s);
            if (p < n - 1 && (s.charAt(p) == '1' || s.charAt(p) == '2' && s.charAt(p + 1) < '7'))
                res += numDecodings(p + 2, s);
            return res;
        }
    }
}
package leetcode;

import java.util.Arrays;
import java.util.HashMap;

//205. Isomorphic Strings
//https://leetcode.com/problems/isomorphic-strings/
public class Isomorphic_Strings {
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            char[] sCharArr = new char[256];
            char[] tCharArr = new char[256];

            for (int i = 0; i < s.length(); i++) {
                char charS = s.charAt(i);
                char charT = t.charAt(i);
                if (sCharArr[charS] == 0 && tCharArr[charT] == 0) {
                    sCharArr[charS] = charT;
                    tCharArr[charT] = charS;
                } else if (sCharArr[charS] != charT) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("egg", "add"));

    }
}

package leetcode;

import java.util.HashMap;

public class Longest_Palindrome {
    static class Solution {
        public int longestPalindrome(String s) {
            HashMap<Character, Integer> hashMap = new HashMap();
            int tmp = 0;
            for (char c : s.toCharArray()
            ) {
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
                if (hashMap.get(c) == 2) {
                    tmp += 2;
                    hashMap.put(c, 0);
                }
            }
            int odd = 0;
            for (Character c : hashMap.keySet()
            ) {
                if (hashMap.get(c) == 1) {
                    odd++;
                    break;
                }
            }
            return tmp+ odd;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
    }
}

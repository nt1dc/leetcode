import java.util.HashMap;

public class Valid_Anagram {

    static class Solution {
        public boolean isAnagram(String s, String t) {
            int []alpha = new int[26];

            for(int i = 0; i < s.length(); i++)
                alpha[s.charAt(i) - 'a']++;

            for(int i = 0; i < t.length(); i++)
                alpha[t.charAt(i) - 'a']--;

            for (int j : alpha) if (j != 0) return false;

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
    }
}

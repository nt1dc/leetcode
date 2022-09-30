package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> hashMap = new HashMap<>();
            List<List<String>> res = new ArrayList<>();
            for (String str : strs
            ) {
                char[] chars = new char[26];
                for (char c : str.toCharArray()
                ) {
                    chars[c - 'a']++;
                }
                String ket = new String(chars);
                hashMap.computeIfAbsent(ket, k -> new ArrayList<>());
                hashMap.get(ket).add(str);
            }
            res.addAll(hashMap.values());
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}

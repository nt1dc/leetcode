package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> hashMap = new HashMap<>();
            for (String str : strs
            ) {
                int[] arr = new int[26];
                for (int i = 0; i < str.length(); i++) {
                    arr[str.charAt(i) - 'a']++;
                }
                String s = Arrays.toString(arr);
                hashMap.computeIfAbsent(s, key -> new ArrayList<>());
                hashMap.get(s).add(str);
            }
            List<List<String>> lists = new ArrayList<>();
            lists.addAll(hashMap.values());
            return lists;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}

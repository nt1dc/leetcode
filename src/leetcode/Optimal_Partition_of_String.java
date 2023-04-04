package leetcode;

import java.util.HashMap;

public class Optimal_Partition_of_String {
    static class Solution {
        public int partitionString(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            int start = -1;
            int partitionCount = 1;
            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= start) {
                    start = i;
                    partitionCount++;
                }
                map.put(s.charAt(i), i);
            }
            return partitionCount;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.partitionString("ssss");
    }
}

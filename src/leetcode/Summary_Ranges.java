//package leetcode;
//
//import javax.swing.text.html.HTMLDocument;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class Summary_Ranges {
//    class Solution {
//        public List<String> summaryRanges(int[] nums) {
//            List<String> ans = new ArrayList<>();
//            for (int i = 0; i < nums.length; i++) {
//                int start = i;
//                    while (i < nums.length-1 && nums[i] + 1 == nums[i + 1]) {
//                    i++;
//                }
//                if (start == i) {
//                    ans.add(String.valueOf(nums[start]));
//                } else {
//                    ans.add(nums[start] + "->" + nums[i]);
//                }
//            }
//            Iterator
//            return ans;
//        }
//    }
//}

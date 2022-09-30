package interview_prepare;

import java.util.ArrayList;
import java.util.Arrays;

public class Dimas_zadacha {
    public static class Solution {
        public ArrayList<String> compress(int[] nums) {
//            1,2,3,4,6,7,8
            nums = Arrays.stream(nums).sorted().toArray();
            ArrayList<String> al = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                int start = nums[i];
                while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) i++;
                if (start != nums[i]) {
                    al.add("" + start + "->" + nums[i]);
                } else {
                    al.add("" + start);
                }
            }
            return al;

        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.compress(new int[]{1, 2, 4,3, 5}));
    }
}

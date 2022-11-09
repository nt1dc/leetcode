package leetcode;

public class Move_Zeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int numPointer = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int tmp = nums[numPointer];
                    nums[numPointer] = nums[i];
                    nums[i] = tmp;
                    numPointer++;
                }
            }
        }
    }
}

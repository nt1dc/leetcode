import java.util.Arrays;

//1480. Running Sum of 1d Array
//https://leetcode.com/problems/running-sum-of-1d-array/
public class Running_Sum_of_1d_Array
{
    static class Solution {
        public int[] runningSum(int[] nums) {
            if (nums.length==1)return nums;
            for (int i = 1; i <nums.length; i++) {
                nums[i]+=nums[i-1];
            }
            return nums;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.runningSum(new int[]{1, 2, 3, 4})));
    }
}

package leetcode;

public class Squares_of_a_Sorted_Array {
    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int arr[] = new int[nums.length];
            int l = 0;
            int r = nums.length - 1;
            int i = r;
            while (l < r) {
                if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                    arr[i--] = nums[l] * nums[l];
                } else {
                    arr[i--] = nums[r] * nums[r];
                }
            }
            return arr;
        }
    }

    public static void main(String[] args) {

    }
}

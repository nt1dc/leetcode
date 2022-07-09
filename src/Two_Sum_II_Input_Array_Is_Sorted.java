public class Two_Sum_II_Input_Array_Is_Sorted {
    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int l = 0;
            int r = numbers.length - 1;
            while (l < r) {
                int lNumber = numbers[l];
                int rNumber = numbers[r];
                int sum = lNumber + rNumber;
                if (sum == target) return new int[]{l+1, r+1};
                if (sum > target) {
                    r--;
                } else l++;
            }
            return null;
        }
    }

    public static void main(String[] args) {

    }
}

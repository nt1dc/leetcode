public class Two_Sum {
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for(int i =1; i<n;++i){
                for(int j =i; j < n; ++j){
                    if (nums[j]+nums[j-i]==target)
                        return new int[]{j-i,j};
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.twoSum(new int[]{2,7,11,15},22);
    }
}

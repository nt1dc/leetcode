import java.util.Arrays;

public class Find_Pivot_Index {
    static class Solution {
        public int pivotIndex(int[] nums) {
            int totalSum = 0;
            for (int i = 0; i < nums.length; i++) {
                totalSum += nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    if (totalSum - nums[i] == 0) {
                        return 0;
                    }
                    continue;
                } else if (totalSum - nums[i] - nums[i-1] == nums[i-1]) {
                    return i;
                }
                nums[i]+=nums[i-1];
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}



public class Maximum_Subarray {
    static class Solution {
        public int maxSubArray(int[] nums) {
            int currentMin = 1;
            int currentMax = 1;
            int res =Integer.MIN_VALUE;
            for (int num : nums) {
                if (num == 0) {
                    currentMax=1;
                    currentMin=1;
                };
                int tmp = currentMax * num;
                currentMax = Math.max(num * currentMax, num * currentMin);
                currentMax = Math.max(currentMax, num);
                currentMin = Math.min(tmp, num * currentMin);
                currentMin = Math.min(currentMin, num);
                res = Math.max(res,currentMax);

            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {-2,0,-1};
        System.out.println(solution.maxSubArray(arr));
    }
}

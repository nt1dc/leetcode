import java.util.*;

public class Three_Sum {

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            nums = Arrays.stream(nums).sorted().toArray();
            List<List<Integer>> ans = new ArrayList<>();
            for (int i = 0; i < nums.length; ++i) {
                if (i != 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int l = i + 1;
                int r = nums.length - 1;
                while (l < r) {
                    if (nums[i] + nums[l] + nums[r] == 0) {
                        ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        ++l;
                        while (l < r && nums[l] == nums[l - 1]) ++l;
                    } else if (nums[i] + nums[l] + nums[r] > 0) r--;
                    else l++;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));

    }
}

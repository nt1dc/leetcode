public class Remove_Element {

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int l = 0;
            int r = nums.length-1;
            int count = 0;
            while (l <= r) {
                if (nums[l] == val) {
                    count++;
                    int tmp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = tmp;
                    r--;
                } else {
                    l++;
                }
            }
            return nums.length-count;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        solution.removeElement(new int[]{1}, 1);
    }
}

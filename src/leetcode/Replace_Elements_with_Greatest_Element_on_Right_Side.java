package leetcode;

import java.util.Arrays;

public class Replace_Elements_with_Greatest_Element_on_Right_Side {
    static class Solution {
        public int[] replaceElements(int[] arr) {
            int max = arr[arr.length - 1];
            arr[arr.length - 1] = -1;
            for (int i = arr.length - 2; i >= 0; i--) {
                int tmp = arr[i];
                arr[i] = max;
                max = Math.max(max, tmp);
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }
}

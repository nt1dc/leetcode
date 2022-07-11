public class Yandex_Public_Interview1 {
    static class Solution {
        public void nearestSum(int[] arr, int x) {
            int l = 0;
            int r = arr.length - 1;
            int nearestSum = 0;
            int i = l;
            int j = r;
            while (l < r) {
                if (Math.abs((arr[l] + arr[r]) - x) < nearestSum) {
                    nearestSum = Math.abs(x - (arr[l] + arr[r]));
                    i = l;
                    j = r;
                }
                if (arr[l] + arr[r] > x) {
                    r--;
                } else l++;
            }
        }
    }
}

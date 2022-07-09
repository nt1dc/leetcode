public class Best_Time_to_Buy_and_Sell_Stock_II {
    static class Solution {
        public int maxProfit(int[] prices) {
            int ans = 0;

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    ans += prices[i] - prices[i - 1];
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1, 9999, 10000};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }
}

public class Best_Time_to_Buy_and_Sell_Stock {
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 1) return 0;
            int maxProfit = 0, start = 0, end = 1;
            while (end < prices.length) {
                if (prices[start] < prices[end]) {
                    if (maxProfit < prices[end] - prices[start]) maxProfit = prices[end] - prices[start];
                } else start = end;
                end++;
            }
            return maxProfit;
        }
    }

    public static void main(String[] args) {

    }
}

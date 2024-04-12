class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if(prices == null || n == 0) return 0;
        
        int buy = prices[0];
        int profit = 0;
        int sell = 0;
        for(int i = 1; i < n; i++){
            buy = Math.min(buy, prices[i] - profit);
            sell = Math.max(profit, prices[i] - buy - fee);
            profit = sell;
        }
        return profit;
    }
}

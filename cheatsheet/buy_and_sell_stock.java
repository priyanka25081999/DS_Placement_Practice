// Array : Best time to buy and sell stock
// Leetcode : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {      
        int sell = Integer.MAX_VALUE, max_profit=0;
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < sell)
                sell = prices[i];
            else
                max_profit = Math.max(max_profit, prices[i]-sell);
        }
        
        return max_profit;
    }
}

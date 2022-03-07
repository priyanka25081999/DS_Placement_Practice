// Array : Best time to buy and sell stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0, selling_price = Integer.MAX_VALUE;
        
        for(int i=0; i<prices.length; i++)
        {
            // if price is smaller, add it to the selling price
            // otherwise if price is larger than selling price, then calculate the profit
            if(prices[i] < selling_price)
                selling_price = prices[i];
            else
                profit = Math.max(profit, prices[i] - selling_price);
        }
        
        return profit;
    }
}

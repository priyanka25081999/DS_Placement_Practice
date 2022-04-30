// Matrix : Richest Customer Wealth - A customer's wealth is the amount of money they have in all their bank accounts. 
// The richest customer is the customer that has the maximum wealth.
// https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for(int i=0; i<accounts.length; i++)
        {   int wealth = 0;
            
            for(int j=0; j<accounts[0].length; j++)
            {
                wealth = wealth + accounts[i][j];
            }
            max = Math.max(max, wealth);
        }
        
        return max;
    }
}

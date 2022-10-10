// DP : Coin Change 2 - Return the number of combinations that make up that amount. 
// Leetcode : https://leetcode.com/problems/coin-change-ii/
// First approach - Recursion (take/not take) - getting TLE

class Solution {
    public int change(int amount, int[] coins) {
        // Any element can be used any number of times
        return helper(amount, coins, coins.length-1);
    }
    
    public int helper(int amount, int coins[], int index)
    {
        // base case
        if(amount==0)
            return 1;
        
        if(index==0)
        {  
            if(amount%coins[0]==0)
                return 1;
            else
                return 0;
        }
        
        int take=0;
        if(amount>=coins[index])
            take = helper(amount-coins[index], coins, index);
        
        int not_take = helper(amount, coins, index-1);

        
        return take+not_take;
    }
}

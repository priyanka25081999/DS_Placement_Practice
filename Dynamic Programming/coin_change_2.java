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

// Second approach : Memorization
// Time Complexity: O(N*T) : There are N*W states therefore at max ‘N*T’ new problems will be solved.
// Space Complexity: O(N*T) + O(N) : We are using a recursion stack space(O(N)) and a 2D array (O(N*T)).

class Solution {
    public int change(int amount, int[] coins) {
        // Any element can be used any number of times
        int dp[][] = new int[coins.length][amount+1];
        
        // initialize the dp
        for(int i=0; i<coins.length; i++)
            Arrays.fill(dp[i], -1); // or: dp[i][0] = -1 
        
        return helper(amount, coins, coins.length-1, dp);
    }
    
    public int helper(int amount, int coins[], int index, int dp[][])
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
        
        // Use of memo/dp table, check if an entry present in dp table or not
        if(dp[index][amount]!=-1)
            return dp[index][amount];
        
        int take=0;
        if(amount>=coins[index])
            take = helper(amount-coins[index], coins, index, dp);
        
        int not_take = helper(amount, coins, index-1, dp);

        dp[index][amount] = take+not_take; //dp[curr_index][curr_amt]=add curr_ways
        return dp[index][amount];
    }
}

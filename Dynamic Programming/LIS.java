// DP : Longest Increasing Subsequence (LIS)
// Leetcode : https://leetcode.com/problems/longest-increasing-subsequence/
// Approach 1 : Recursion, getting TLE

class Solution {
    public int lengthOfLIS(int[] nums) {
        return helper(0, -1, nums);
    }
    
    public int helper(int index, int prev, int nums[])
    {
        // base case
        if(index==nums.length)
            return 0;
        
        int not_take = helper(index+1, prev, nums);
        
        int take=-1;
        if(prev==-1 || nums[index]>nums[prev])
            take = 1 + helper(index+1, index, nums);
        
        return Math.max(not_take, take);
    }
}

// Approach 2 : Memorization approach
// Getting output now
// Time complexity : O(N*T)
// Space complexity : O(N*T) + O(N) : We are using a recursion stack space(O(N)) and a 2D array (O(N*T))

class Solution {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int dp[][] = new int[length][length+1];
        
        for(int i=0; i<length; i++)
            Arrays.fill(dp[i], -1);
        
        return helper(0, -1, nums, dp);
    }
    
    public int helper(int index, int prev, int nums[], int dp[][])
    {
        // base case
        if(index==nums.length)
            return 0;
        
        if(dp[index][prev+1] != -1)
            return dp[index][prev+1];
        
        int not_take = helper(index+1, prev, nums, dp);
        
        int take=-1;
        if(prev==-1 || nums[index]>nums[prev])
            take = 1 + helper(index+1, index, nums, dp);
        
        return dp[index][prev+1] = Math.max(not_take, take);
    }
}

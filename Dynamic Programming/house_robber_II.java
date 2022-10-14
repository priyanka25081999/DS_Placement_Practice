// DP : House Robber II
// Leetcode : https://leetcode.com/problems/house-robber-ii/
// Recursion - getting TLE

class Solution {
    public int rob(int[] nums) {
        // base case
        if(nums.length==1)
            return nums[0];
        
        // even circle
        int one = helper(nums, 0, nums.length-2);
        // odd circle
        int two = helper(nums, 1, nums.length-1);
        
        return Math.max(one, two);
    }
    
    public int helper(int nums[], int start_index, int end_index)
    {
        if(end_index < start_index)
            return 0;
        
        if(start_index == end_index)
            return nums[start_index];
        
        return Math.max(helper(nums, start_index, end_index-1), helper(nums, start_index, end_index-2)+nums[end_index]);
    }
}

// Another optimized approach : Memoization

class Solution {
    int dp[][];
    public int rob(int[] nums) {
        // base case
        if(nums.length==1)
            return nums[0];
        
        dp = new int[nums.length+1][2];
        for(int rows[] : dp)
            Arrays.fill(rows, -1);
        
        
        int one = helper(nums, 0, nums.length-2, 0);
        int two = helper(nums, 1, nums.length-1, 1);
        
        return Math.max(one, two);
    }
    
    public int helper(int nums[], int start_index, int end_index, int index)
    {
        if(end_index < start_index)
            return 0;
        
        if(start_index == end_index)
            return dp[end_index][index] = nums[start_index];
        
        // check entry in our dp(memo) table, if it is there then return the value
        if(dp[end_index][index] != -1)
            return dp[end_index][index];
        
        return dp[end_index][index] = Math.max(helper(nums, start_index, end_index-1, index), helper(nums, start_index, end_index-2, index)+nums[end_index]);
    }
}

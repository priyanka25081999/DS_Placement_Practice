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

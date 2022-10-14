// DP : House Robber
// Leetcode : https://leetcode.com/problems/house-robber/
// Recursive approach : Getting TLE

class Solution {
    public int rob(int[] nums) {   
        return helper(nums, nums.length-1);
    }
    
    public int helper(int nums[], int index)
    {
        // base case
        if(index < 0)
            return 0;
        
        // if we reach at index 0, which means we haven't pick 1st index element as we are starting the recursion from last element by picking adjusant only.
        // Hence pick the 0th index element and return it so that it will get added into our final sum and also as we want to maximize our sum
        if(index == 0)
            return nums[index];
        
        // pick the element, add it's sum and call to index-2 element, as adjusant are not allowed to pick
        int pick = nums[index]+helper(nums, index-2);
        
        // not pick the element, then move to the next adjustant
        int not_pick = 0+helper(nums, index-1);
        
        return Math.max(not_pick, pick);
    }
}

// DP : Memorization approach
// Time complexity : O(N)
// Space complexity : O(N)+O(N)

class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        
        return helper(nums, nums.length-1, dp);
    }
    
    public int helper(int nums[], int index, int dp[])
    {
        // base case
        if(index < 0)
            return 0;
        
        // if we reach at index 0, which means we haven't pick 1st index element as we are starting the recursion from last element by picking adjusant only.
        // Hence pick the 0th index element and return it so that it will get added into our final sum and also as we want to maximize our sum
        if(index == 0)
            return nums[index];
        
        // if the entry is there in dp array, directly return it
        if(dp[index]!=-1)
            return dp[index];
        
        // pick the element, add it's sum and call to index-2 element, as adjusant are not allowed to pick
        int pick = nums[index]+helper(nums, index-2, dp);
        
        // not pick the element, then move to the next adjustant
        int not_pick = 0+helper(nums, index-1, dp);
        
        return dp[index] = Math.max(not_pick, pick);
    }
}

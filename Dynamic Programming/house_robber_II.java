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

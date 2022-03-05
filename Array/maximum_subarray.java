// Array : Maximum subarray
// Find the contiguous subarray (containing at least one number) which has the largest sum.
// https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length < 2)
           return nums[0];
       
        int current_max = nums[0], current_sum = 0;
        for(int i=0; i<nums.length; i++)
        {
            current_sum = Math.max(nums[i], current_sum + nums[i]);
            current_max = Math.max(current_sum, current_max);
        }
        
        return current_max;
    }
}

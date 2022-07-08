// Array : Maximum subarray (Kadane's algorithm)
// Leetcode : https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        // if an array has less then 2 elements then return the 0th element
        if(nums.length < 2)
            return nums[0];
        
        int current_sum = 0, current_max = nums[0];
        
        for(int i=0; i<nums.length; i++)
        {
            current_sum = Math.max(current_sum+nums[i], nums[i]);
            current_max = Math.max(current_max, current_sum);
        }
        
        return current_max;
    }
}

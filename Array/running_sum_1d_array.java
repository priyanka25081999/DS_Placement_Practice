// Array : Running sum of 1D array
// https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        // declare an array and maintain a sum variable
        int ans[] = new int[nums.length];
        int sum = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            sum = sum + nums[i];
            ans[i] = sum;
        }
        
        return ans;
    }
}

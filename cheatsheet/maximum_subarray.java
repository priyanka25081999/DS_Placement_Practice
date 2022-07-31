// Array : Maximum subarray (Kadane's algorithm)
// Leetcode : https://leetcode.com/problems/maximum-subarray/
// Link for reference : https://www.youtube.com/watch?v=5WZl3MMT0Eg
// Approach-1 : Kadane's Algorithm O(n)
// Linear algorithm and no extra memory required
// We keep increamenting our right pointer and ignore the -ve elements of the array
// We remove the -ve prefix of the array

class Solution {
    public int maxSubArray(int[] nums) {
        // if an array has less then 2 elements then return the 0th element
        if(nums.length < 2)
            return nums[0];
        
        // current max should contain 1st array element, by assuming it as our first max sum.
        int current_sum = 0, current_max = nums[0];
        
        for(int i=0; i<nums.length; i++)
        {
            // store the subarray sum into current_sum and add new element in it (DP)
            current_sum = Math.max(current_sum+nums[i], nums[i]);
            current_max = Math.max(current_max, current_sum);
        }
        
        return current_max;
    }
}

// Approach-2 : Brute force method - O(n^2)
// Getting TLE (Time Limit Exceeded)
class Solution {
    public int maxSubArray(int[] nums) {
        int i=0, j=0, max_sum = Integer.MIN_VALUE;
        
        for(i=0; i<nums.length; i++)
        {
            int sum=0;
            for(j=i; j<nums.length; j++)
            {
                // window/subarray is formed from i=0...j
                sum = sum + nums[j];
                max_sum = Math.max(max_sum, sum);
            }
            
        }
        
        return max_sum;
    }
}

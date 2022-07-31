// Array : Maximum product subarray
// Leetcode : https://leetcode.com/problems/maximum-product-subarray/
// Approach-1 : Brute force method - O(n^2)

class Solution {
    public int maxProduct(int[] nums) {
        int max_product = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            int current_product = 1;
            for(int j=i; j<nums.length; j++)
            {
                current_product *= nums[j];
                max_product = Math.max(max_product, current_product);
            }
        }
        
        return max_product;
    }
}

// Approach-2 : Dynamic programming (DP)
// Time complexity : O(n) 
// Link for reference : https://www.youtube.com/watch?v=lXVy6YWFcRM

class Solution {
    public int maxProduct(int[] nums) {
        // maintain the min and max of the subarray
        int local_min = nums[0], local_max = nums[0], max_product = nums[0];
        
        for(int i=1; i<nums.length; i++)
        {
            // get the maximum value
            int temp = Math.max(nums[i], Math.max(local_max * nums[i], local_min * nums[i]));
            // get the minimum value
            local_min = Math.min(nums[i], Math.min(local_max * nums[i], local_min * nums[i]));
            
            // assign the max to local_max
            local_max = temp;
            
            // update the final max_product value
            max_product = Math.max(max_product, local_max);
        }
        
        return max_product;
    }
}

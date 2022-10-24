// Array : Maximum product subarray
// Leetcode : https://leetcode.com/problems/maximum-product-subarray/
// Brute force approach
// Time complexity : O(N^2)
// Space complexity : O(1)

class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1)
            return nums[0];
        
        int result = 0;
        for(int i=0; i<nums.length; i++)
        {
            int product = 1;
            for(int j=i; j<nums.length; j++)
            {
                product = product*nums[j];
                result = Math.max(result, product);
            }
        }
        
        return result;
    }
}

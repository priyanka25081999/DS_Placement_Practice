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

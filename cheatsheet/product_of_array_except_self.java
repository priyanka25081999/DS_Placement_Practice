// Array : Product of array except self
// Leetcode : https://leetcode.com/problems/product-of-array-except-self/
// Approach 1 : Brute force approach (Getting time limit exceeded)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // create an answer array
        int ans[] = new int[nums.length];
        
        for(int i=0; i<nums.length; i++)
        {
            int product = 1;
            for(int j=0; j<nums.length; j++)
            {
                if(i!=j)
                {
                    product = product * nums[j];
                }
            }
            
            ans[i] = product;
        }
        
        return ans;
    }
}

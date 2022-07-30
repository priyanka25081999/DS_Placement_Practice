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

// Second cool approach is by using division operator
// Take the product of whole input array and divide it by position wise
// For example: nums[] = {1,2,3,4}
// Product of nums array, prod = 24
// Create an answer array and put the product by following
// ans[0] = prod/nums[i]   (where, i = 0, and nums[i] = 1. Hence ans[0] = 24)
// ans[1] = prod/nums[i]   (where, i = 1, and nums[i] = 2. Hence ans[1] = 12)
// ans[2] = prod/nums[i]   (where, i = 2, and nums[i] = 3. Hence ans[2] = 8)
// ans[3] = prod/nums[i]   (where, i = 3, and nums[i] = 4. Hence ans[3] = 6)
// But, due to this limitation ("You must write an algorithm that runs in O(n) time and without using the division operation.") given in the problem
// we will not use division operator



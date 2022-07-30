// Array : Product of array except self
// Leetcode : https://leetcode.com/problems/product-of-array-except-self/
// check notebook for more information
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

// Approach 3 - Prefix sum
// By taking arrays for prefix and postfix
// One drawback - taking more memory i.e O(n) extra memory is required to store prefix and postfix
// Link for more description - https://www.youtube.com/watch?v=bNvIQI2wAjk

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre[] = new int[nums.length];
        int post[] = new int[nums.length];
        int ans[] = new int[nums.length];
        
        int pre_product = 1, post_product = 1;
        
        // calculate prefix product
        for(int i=0; i<nums.length; i++)
        {
            pre_product = pre_product * nums[i];
            pre[i] = pre_product;
        }
        
        // calculate postfix product
        for(int i=nums.length-1; i>=0; i--)
        {
            post_product = post_product * nums[i];
            post[i] = post_product;
        }
        
        // calcluate the final product
        for(int i=0; i<nums.length; i++)
        {
            // if it is a first element, then it doesn't have prefix
            // hence take only postfix
            if(i==0)
                ans[i] = post[i+1];
            // if it is the last element, then it doesn't have postfix
            // hence take only prefix
            else if(i == nums.length-1)
                ans[i] = pre[i-1];
            else
                ans[i] = pre[i-1] * post[i+1];
        }
        
        return ans;
    }
}

// Approach-4 : Prefix sum
// Using single output array - O(n) time complexity overall, no extra memory (for prefix and postfix arrays - like approach3)
// Link for more description - https://www.youtube.com/watch?v=bNvIQI2wAjk

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Create an answer array
        int ans[] = new int[nums.length];
        
        // traverse from left to right first to get prefix
        int prefix_product = 1;
        for(int i=0; i<nums.length; i++)
        {
            ans[i] = prefix_product;
            prefix_product = prefix_product * nums[i];
        }
        
        // traverse from right to left to get postfix 
        int postfix_product = 1;
        for(int i=nums.length-1; i>=0; i--)
        {
            ans[i] = postfix_product * ans[i];
            postfix_product = postfix_product * nums[i];
        }
        
        return ans;
    }
}

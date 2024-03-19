// Problem: https://leetcode.com/problems/product-of-array-except-self/
// The time complexity is O(n^2), where n is the length of the input array nums. There are two nested loops iterating over the array: one loop to iterate through each element of nums, 
// and another loop nested inside to calculate the product of all elements except the current one.
// The space complexity is O(n), where n is the length of the input array nums. An additional array ans of the same length as nums is created to store the products.
// But this solution gives TLE for few test cases

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            int prod = 1;

            for(int j=0; j<nums.length; j++) {
                if(i!=j) {
                    prod = prod * nums[j];
                }
            }

            ans[i] = prod;
        }

        return ans;
    }
}

// Solution-2 - Prefix sum
// Using single output array - O(n) time complexity overall, no extra memory
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];

        // traverse from left to right
        int left = 1;
        for(int i=0; i<nums.length; i++) {
            ans[i] = left;
            left = left * nums[i];
        }

        // traverse from right to left
        int right = 1;
        for(int i=nums.length-1; i>=0; i--) {
            ans[i] = right * ans[i];
            right = right * nums[i];
        }

        return ans;
    }
}

// Array : Move zeros at the end of an array
// Single Pointer Approach
// https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        // Single pointer solution -> O(n)
        
        int new_start = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
              nums[new_start++] = nums[i];
        }
        
        // fill zeros at the end till length
        for(int i=new_start; i<nums.length; i++)
            nums[i] = 0;
    }
}

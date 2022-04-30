// Array : Build Array from Permutation
// https://leetcode.com/problems/build-array-from-permutation/

class Solution {
    public int[] buildArray(int[] nums) {
        // declare the result array
        int res[] = new int[nums.length];
        
        for(int i=0; i<nums.length; i++)
        {
            res[i] = nums[nums[i]];
        }
        
        return res;
    }
}

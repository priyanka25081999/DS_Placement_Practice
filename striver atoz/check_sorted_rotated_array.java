// Array : Check if Array Is Sorted and Rotated
// Leetcode : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
// Efficient approach in single pass
// Time complexity : O(N)
// Space complexity : O(1)

class Solution {
    public boolean check(int[] nums) {
        
        int cnt=0;
        
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1] > nums[i])
                cnt++;
        }
        
        // check the first and last element here
        // if rotated, then this if condition becomes false
        if(nums[0] < nums[nums.length-1])
            cnt++;
        
        if(cnt<=1)
            return true;
        else
            return false;
    }
}

// Array : Find the missing number
// Leetcode : https://leetcode.com/problems/missing-number/
// Approach1 : Time complexity - O(nlogn)

class Solution {
    public int missingNumber(int[] nums) {
        // sort the array
        Arrays.sort(nums);
        
        int i=0;
        for(i=0; i<nums.length; i++)
        {
            if(i != nums[i])
                return i;
        }
        return i;
    }
}

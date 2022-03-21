// Array : Two sum
// Find two numbers such that they add up to a specific target number
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Two pointer approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Two pointer approach
        
        // final answer array
        int ans[] = new int[2];
        int i=0, j=nums.length-1;
        
        while(i<j)
        {
            // if sum of 2 nums equal to target
            // break the loop and add i and j position into answer array
            if(nums[i] + nums[j] == target)
                break;
            
            // if sum is greater than the target
            // then decrement j pointer by one
            // else increament i pointer by one
            if(nums[i] + nums[j] > target)
                j--;
            else
                i++;
        }
        
        ans[0] = i+1;
        ans[1] = j+1;
        return ans;
    }
}

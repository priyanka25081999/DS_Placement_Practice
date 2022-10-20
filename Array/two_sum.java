// Array : Two sum
// https://leetcode.com/problems/two-sum/
// Time complexity : O(N^2)
// Space complexity : O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int ans[] = new int[2];
        
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(i!=j && nums[i]+nums[j] == target)
                {    ans[0] = i;
                     ans[1] = j;
                }
            }
        }
        
        return ans;
        
    }
}

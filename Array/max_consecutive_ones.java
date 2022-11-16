// Array : Find the maximum consecutive ones(1s) in the array
// Leetcode : https://leetcode.com/problems/max-consecutive-ones/
// Time complexity : O(N)
// Space complexity : O(1)

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, cnt=0;
        
        for(int i=0; i<nums.length; i++)
        {
            // if one then increament count
            if(nums[i] == 1)
                cnt++;
            else
            {
                // get the current max count of 1s to max variable 
                max = Math.max(max, cnt);
                // and as it is not consecutive 1s, let's initialize the cnt to 0 again
                cnt=0;
            }
        }
        
        return Math.max(max, cnt);
    }
}

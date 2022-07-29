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

// Approach2 : Time complexity O(n)
class Solution {
    public int missingNumber(int[] nums) { 
        int total_cnt=0, current_cnt=0;
        
        // find the total count
        for(int i=0; i<=nums.length; i++)
            total_cnt = total_cnt + i;
        
        // find the current count
        for(int i=0; i<nums.length; i++)
            current_cnt = current_cnt + nums[i];
        
        return total_cnt - current_cnt;
    }
}

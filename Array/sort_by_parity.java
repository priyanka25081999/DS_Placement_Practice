// Array : Sort array by parity
// 2 pointers approach
// Leetcode : https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // Two pointers approach
        int st = 0;
        int end = nums.length-1;
    
        while(st<end)
        {
            // if the number the odd, move it to the end
            if(nums[st]%2 == 1)
            {
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
                
                end--;
            }
            else
            {
                st++;
            }
        }
        
        return nums;
    }
}

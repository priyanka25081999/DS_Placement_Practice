// Array : Rotate an array 'k' times
// https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
      
        int temp[] = new int[nums.length];
        
        for(int i=0; i<nums.length; i++)
        {
            temp[(i+k)%nums.length] = nums[i];
            /* temp array elements, loop wise: temp[i] -> temp[(i+k)%nums.length]
               temp : 0 -> -1   
               temp : 0 -> -100 
               temp : -1 -> 3   
               temp : -100 -> 99 
            */
        }
        
        // put newly rotated elements into nums array
        for(int i=0; i<nums.length; i++)
            nums[i] = temp[i];
    }
}

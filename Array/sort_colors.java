// Array : Sort Colors
// Brute force method
// https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        // count the red, blue and white
        int red_count=0, white_count=0, blue_count=0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
                red_count++;
            else if(nums[i] == 1)
                white_count++;
            else
                blue_count++;
        }
        
        // Modify the nums array, according to count
        for(int i=0; i<nums.length; i++)
        {
            if(red_count > 0)
            {
                nums[i] = 0;
                red_count--;
            }
            else if(white_count > 0)
            {
                nums[i] = 1;
                white_count--;
            }
            else
            {
                nums[i] = 2;
                blue_count--;
            }
        }
    }
}

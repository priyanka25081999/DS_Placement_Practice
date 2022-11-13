// Array : Rotate an array 'k' times
// Leetcode : https://leetcode.com/problems/rotate-array/
// Approach-1 : By using temp array
// Time complexity : O(N)
// Space complexity : O(N), as we are storing an array elements into temp array

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

// Approach-2 : By using partition approach
// Time complexity : O(N)
// Space complexity : O(1), as we are not using any extra space. Doing in-place

class Solution {
    public void rotate(int[] nums, int k) {
        // using partition approach
        int mid = k % nums.length;
        
        // the below condition is used when mid is non-negative
        if(mid < 0)
            mid = mid + nums.length;
        
        // from 0 to mid-1
        rotate(nums, 0, nums.length-mid-1);
        // from mid to nums.length
        rotate(nums, nums.length-mid, nums.length-1);
        // rotate the complete array
        rotate(nums, 0, nums.length-1);
    }
    
    void rotate(int nums[], int start, int end)
    {
        // swap the array elements
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }
}

// Rotate an array to left by k times
// Approach : By using partition approach (same as approach-2 above)
// Time complexity : O(N)
// Space complexity : O(1), as we are not using temp array. Doing in-place.

class Solution
{
    void leftRotate(long nums[], int k,int n)
    {
        int mid = k % nums.length;
        
        // the below condition is used when mid is non-negative
        if(mid < 0)
            mid = mid + nums.length;
        
        // from 0 to end. First reverse entire array
        rotate(nums, 0, n-1);
        // from 0 to mid-1
        rotate(nums, 0, nums.length-mid-1);
        // rotate mid to end
        rotate(nums, nums.length-mid, nums.length-1);
        
    }
    
    void rotate(long nums[], int start, int end)
    {
        // swap the array elements
        while(start < end) {
            long temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }
}

// For right rotation -> First, reverse 0 to mid then mid to end and then reverse the entire array.
// For left rotation -> First, reverse the entire array, then reverse 0 to mid and then reverse mid to end array elements.

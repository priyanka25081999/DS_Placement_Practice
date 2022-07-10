// Array : Search in rotated sorted array
// Leetcode : https://leetcode.com/problems/search-in-rotated-sorted-array/
// First approach - Linear Search - O(n)

class Solution {
    public int search(int[] nums, int target) {
      for(int i=0; i<nums.length; i++)
      {
          if(nums[i] == target)
              return i;
      }
      return -1;
    }
}

/* Second approach - Binary Search - O(logn)

class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        
        // Binary search
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            
            if(nums[mid] == target)
                return mid;
            
            // check in 2nd half
            if(target > nums[mid] && target < nums[high])
                low = mid;
            // check in 1st half
            else if(target < nums[mid] && target > nums[low])
                high = mid;
            // compare the last element and return if matches with target
            else if(target == nums[high]) 
                return high;
            
            high = high-1;
        }
        
        return -1;
    }
}

*/

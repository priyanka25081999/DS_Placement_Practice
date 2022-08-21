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

/* Third approach - Binary search

class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        
        // base condition
        if(nums[start]>target && nums[end]<target)
            return -1;
        
        while(start <= end)
        {
            int mid = start + (end-start)/2;  // to avoid integer overflow
            
            if(nums[mid] == target)
                return mid;
            else if(nums[start] <= nums[mid])
            {
                if(nums[start] <= target && target < nums[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            else
            {
                if(target <= nums[end] && target > nums[mid])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        
        return -1; // no element found
    }
}
*/

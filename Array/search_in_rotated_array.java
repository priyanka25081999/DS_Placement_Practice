// Array : Search an element in rotated sorted array
// 1st approach : Binary Search. Time complexity : best case - O(logn), worst case - O(n)
// 2nd approach : Linear Search. Time complexity : best case - O(1), worst case - O(n)

// First approach : Binary search
class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length-1, mid;
        
        while(low<=high)
        {
            mid = low+(high-low)/2;
            
            if(nums[mid] == target)
                return true;
            
            // check the second half
            if(target > nums[mid] && target < nums[high])
                low = mid;
            // check the first half
            else if(target < nums[mid] && target > nums[low])
                high = mid;
            // check the last element
            else if(target == nums[high])
                return true;
            
            high = high-1;
        }
        
        return false;
    }
}

/* 
// Second Approach : Linear search

class Solution {
    public boolean search(int[] nums, int target) {
       
       // Traverse the elements of an array
       // if an element matches with target return true
       // else return false
       
       for(int i : nums)
       {
          if(i == target)
            return true;
       }
       return false;
    }
}
  
*/

// Array : Find Minimum in Rotated Sorted Array
// Leetcode : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

// Approach-1
class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}

// Approach-2 : Binary Search 
// Time complexity - O(logn)
// Space complexity - O(1)
// check the example on find_minimum_in_rotated_array.png - https://github.com/priyanka25081999/DS_Placement_Practice/blob/main/Array/find_minimum_in_rotated_array.PNG
/*
class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length-1;
        
        while(start<=end)
        {
            int mid = (start+end)/2;
            
            // array is sorted, change the position of end to mid
            if(nums[mid] < nums[end])
                end = mid;
            // array is not sorted, move the start to mid+1
            else if(nums[mid] > nums[end])
                start = mid+1;
            // if mid is equal end then we got the minimum element, now return it
            else
                return nums[end];    
        }
        
        return nums[end];
    }
}
*/

// Binary search approach :  Find the index if the target is found
// Floor of the number
// https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid;
        
        // binary search approach
        while(low <= high)
        {
            mid = (low + high)/2;
            
            if(nums[mid] == target)
                return mid;
            else if(nums[mid]<target)
                low = mid+1;
            else
                high = mid-1; 
        }
        
        // Floor of the number (target) - largest number which is smaller than or equal to the target
        // Link to find floor of the number : https://github.com/priyanka25081999/DS_Placement_Practice/blob/main/Array/ceiling_and_floor.java
        return high+1;
    }
}

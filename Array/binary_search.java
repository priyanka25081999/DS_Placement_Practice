// Binary search
// https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;
          
        while(low<=high)
        {
            // find the mid
            int mid = (low+high)/2;
            
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        
        return -1;
    }
}

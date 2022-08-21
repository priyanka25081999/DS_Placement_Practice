// Array : Search an element in nearly sorted array
// Binary search : compare mid, mid-1 and mid+1
// Also check upper and lower bound to avoid segmentation fault
// Time complexity : O(logn)

public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        
        while(start <= end)
        {
            int mid = start + (end-start)/2;  // to avoid integer overflow
            
            if(nums[mid] == target)
                return mid;
            // to avoid segmentation fault check the lower and upper bound (i.e nums[mid-1] >= start - lower bound and nums[mid+1] <= end - upper bound)
            else if(nums[mid-1] >= start && nums[mid-1] == target)
                return mid-1;
            else if(nums[mid+1] <= end && nums[mid+1] == target)
                return mid+1;
            else if(target < nums[mid-1])
                end = mid-2;
            else if(target > nums[mid+1])
                start = mid+2;
        }
        
        return -1;
    }
}

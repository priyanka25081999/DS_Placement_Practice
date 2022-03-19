// Binary Search Approach : Find the first bad version
// https://leetcode.com/problems/first-bad-version/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int ans = -1;
        
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(isBadVersion(mid))
            {
                // store the answer and move left side 
                // That is to find smaller version
                ans = mid;
                high = mid-1;
            }
            else
                // find the right side
                low = mid+1; 
        }
        
        return ans;
    }
}

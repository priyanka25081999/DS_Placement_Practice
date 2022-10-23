// Array : Find the maximum amount of water a container can store
// Two pointer approach
// Time complexity : O(N)
// Space complexity : O(1) - not using any extra space
// Leetcode : https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        // Area = widht * height
        // Height is given here. So, we are interested to find width
        // Width can be find as = right - left (i.e get the difference of the line)
        // And we require to take min height from lines, bcz water might overflow, hence to avoid that we are grabbing the min line
        
        int left = 0, right = height.length-1;
        int max = 0; // initially max area is 0
        
        while(left < right)
        {
            // first thing is to find width
            int width = right - left;
            // find min height
            int min_height = Math.min(height[left], height[right]);
            // find the area
            int area = width * min_height;
            
            // reinitialize the max value
            max = Math.max(max, area);
            
            // we always move slow height pointer, bcz we want max area container
            if(height[left] < height[right])
                left++;
            else if(height[left] > height[right])
                right--;
            else // if both heights are equal, move both pointers
            {
                left++;
                right--;
            }
        }
        
        return max;
    }
}

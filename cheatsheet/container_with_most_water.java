// Array : Container with most water
// Leetcode : https://leetcode.com/problems/container-with-most-water/
// Two pointer approach
// More information : https://www.youtube.com/watch?v=UuiTKBwPgAo

class Solution {
    public int maxArea(int[] height) {
        // Area = width * height
        // height is given, we first need to find width
        // width = right - left
        
        int left=0, right=height.length-1, max=0;
        
        while(left < right)
        {
            int width = right-left;
            // here we find minimum height to get maximum area
            int ht = Math.min(height[left], height[right]);
            int area = width * ht;
            max = Math.max(max, area);
            
            // we always move slow height pointer, bcz we want max area container
            if(height[left] > height[right])
                right--;
            else if(height[left] < height[right])
                left++;
            else // if both heights are equal, move both pointers
            {
                left++;
                right--;
            }
        }
        
        return max;
    }
}


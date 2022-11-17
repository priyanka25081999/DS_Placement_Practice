// Matrix : Search an element in a 2D matrix
// https://leetcode.com/problems/search-a-2d-matrix/
// Approach-1 : Brute force
// Time complexity : O(N*M) 
// Space complexity : O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                // if an element equals to target element, return true
                if(matrix[i][j] == target)
                    return true;
                // if an element lesser than target, keep searching in same row
                else if(matrix[i][j] < target)
                    continue;
                // if an element larger than target, break the loop and move to next row.
                else 
                    break;     
            }
        }
        return false;
    }
}

// Approach-2 : As matrix is sorted, we can apply binary search
// Time complexity : O(log(m*n))
// Space complexity : O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // let's try binary search
        // base case
        if(matrix.length == 0)
            return false;
        
        int low = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int high = (row*col)-1;  
        // Example: row = 3, col = 4. high = (3*4)-1 = 11
        // our range becomes 0-11
        
        while(low<=high)
        {
            int mid = (low+(high-low)/2);
            
            if(matrix[mid/col][mid%col] == target)
                return true;
            else if(matrix[mid/col][mid%col] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        
        return false;
    }
}

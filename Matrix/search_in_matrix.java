// Matrix : Search an element in a 2D matrix
// https://leetcode.com/problems/search-a-2d-matrix/
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

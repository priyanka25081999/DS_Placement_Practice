// Matrix : Shift 2D grid
// Brute force method
// https://leetcode.com/problems/shift-2d-grid/

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        // find row and column
        int row = grid.length, col = grid[0].length;
        int temp[][] = grid;
        
        while(k > 0)
        {
            // for each iteration, init for each loop
            temp = new int[row][col];
            
            // Element at grid[i][j] moves to grid[i][j + 1].
            // i.e shift the elements to right
            for(int i=0; i<row; i++)
            {
                for(int j=1; j<col; j++)
                {
                    temp[i][j] = grid[i][j-1];
                }
            }
            
            // Element at grid[i][n - 1] moves to grid[i + 1][0]/
            // i.e move the last element of row to first element of next row
            for(int i=1; i<row; i++)
            {
                temp[i][0] = grid[i-1][col-1];
            }
            
            
            // Element at grid[m - 1][n - 1] moves to grid[0][0].
            // i.e move the last element to first place
            temp[0][0] = grid[row-1][col-1];
            
            grid = temp;
            k--;
        }
        
        return (List)Arrays.asList(temp);
    }
}

// Array : Set Matrix Zero (Assuming array contains non-negative elements)
// Brute force approach
// Time Complexity:O((N*M)*(N + M)). O(N*M) for traversing through each element and (N+M)for traversing to row and column of elements having value 0.
// Space Complexity:O(1)
// This solution will not work if array contains non-negative elements
// Striver sheet - https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/
// Leetcode - https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    // replace i-1 rows values with -1
                    // The reason for not changing other elements to 0, but -1, 
                    // because that might affect other columns and rows.
                    int index = i-1;
                    while(index >= 0)
                    {
                        if(matrix[index][j]!=0)
                            matrix[index][j] = -1;
                        
                        index--;
                    }
                    
                    // replace i+1 rows with value -1
                    index = i+1;
                    while(index < matrix.length)
                    {
                        if(matrix[index][j] != 0)
                            matrix[index][j] = -1;
                        
                        index++;
                    }
                    
                    // replace j-1 columns with value -1
                    index = j-1;
                    while(index >= 0)
                    {
                        if(matrix[i][index] != 0)
                            matrix[i][index] = -1;
                        
                        index--;
                    }
                    
                    // replace j+1 columns with value -1
                    index = j+1;
                    while(index < matrix[0].length)
                    {
                        if(matrix[i][index] != 0)
                            matrix[i][index] = -1;
                        
                        index++;
                    }
                }               
            }
        }
    
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] <= 0)
                    matrix[i][j] = 0;
            }
        }
    }
}

// Approach 2 - Better solution
// Maintain 2 dummy arrays to check if the particular row or column has an element 0 or not
// Time complexity - O(N*M + N*M)
// Space complexity - O(N) - as we are keeping 2 dummy arrays

class Solution {
    public void setZeroes(int[][] matrix) {
        // create 2 arrays to check if the particular row or column has an element 0 or not
        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];
        
        Arrays.fill(row, -1);
        Arrays.fill(col, -1);
        
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(row[i] == 0 || col[j] == 0)
                    matrix[i][j] = 0;
            }
        }
    }
}

// Approach 3 - to reduce the space complexity and have the optimize solution
// instead of making 2 dummy arrays for row and column, we can re-use 1st column and 1st row of the given matrix
// this way our new space complexity becomes - O(1) and we need to traverse two times in a matrix hence
// time complexity becomes - O(2*(N*M))
// Code will be available in above link


// Matrix : Reshape the matrix
// https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
       int row = mat.length;
       int col = mat[0].length;
        
       int newMat[][] =  new int [r][c];
       if(r*c != row*col)
       {
            return mat;
       }
       else
       {
            int new_col =0;
            int new_row =0;
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    newMat[new_row][new_col] = mat[i][j];
                    new_col++;
                    if(new_col==c)
                    {
                        new_row++;
                        new_col=0;  
                    }
                }
             }
          return newMat;
        }
   }
}

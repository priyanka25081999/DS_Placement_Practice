// Matrix : Matrix diagonal sum
// Leetcode : https://leetcode.com/problems/matrix-diagonal-sum/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        ArrayList<Integer> list1 = new ArrayList<>();
        
        // primary diagonal - mat[i][i]
        for(int i=0; i<mat.length; i++)
        {
                list1.add(mat[i][i]);
        }
        
        // secondary diagonal - mat[i][end--]
        int end = mat.length-1; // 0-based index
        for(int i=0; i<mat.length; i++)
        {
                list1.add(mat[i][end--]);
        }
        
        // calculate the sum
        for(int i : list1)
        {
            sum = sum + i;
        }
        
        // skip the middle element, if matrix size is odd
        if(mat.length %2 == 1)
            sum = sum - mat[mat.length/2][mat.length/2];
        
        return sum;
    }
}

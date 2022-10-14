// DP : Unique Paths
// Leetcode : https://leetcode.com/problems/unique-paths/
// Recursion + Memoization approach
// Time Complexity: O(M*N) : There are two nested loops
// Space Complexity: O(M*N) : We are using an external array(dp) for memo of size ‘M*N’.

class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int rows[] : dp)
            Arrays.fill(rows, -1);
        
        return helper(m, n, dp);
    }
    
    public int helper(int m, int n, int dp[][])
    {
        
        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                // if index is 0 then put 1
                if(i==0 || j==0)
                {
                    dp[i][j] = 1;
                    continue;
                }

                int top=0, left=0;
                
                // move to the top
                if(i>0)
                    top = dp[i-1][j];
                
                // move to the left
                if(j>0)
                    left = dp[i][j-1];
                
                // add the top and left and put it into memo(dp) table
                dp[i][j] = top+left;
            }
        }
        return dp[m-1][n-1];
    }
    
}

// Matrix : find the max area of island
// DFS approach
// https://leetcode.com/problems/max-area-of-island/

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        // Get the total rows and column of grid
        int m = grid.length;
        int n = grid[0].length;
        
        int max_island_area = 0;
        
        // create a visited array
        boolean visited[][] = new boolean[m][n];
        
        // start the nested for loop
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                // if the element is not visited and it is not part of water
                // then apply dfs for current element and find it's island area
                
                if(!visited[i][j] && grid[i][j]!=0)
                {
                    // initialize the count variable 
                    // count will store the area of the island formed by current element
                    
                    int cnt[] = new int[1];
                    dfs(grid, i, j, visited, cnt);
                    
                    max_island_area = Math.max(max_island_area, cnt[0]);
                }
            }
        }
        return max_island_area;
    }
    
    public void dfs(int grid[][], int row, int col, boolean visited[][], int[] cnt)
    {
        // base condition
        // if row and col are lesser than 0 or greater than length then return
        // if area is water or visited then also return from the function
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col] == 0 || visited[row][col])
            return;
        
        // make the current area(element) as visited and increase the cnt value by 1
        visited[row][col] = true;
        cnt[0]++;
        
        // otherwise, check the all 4 directions of island to get maximum area of island
        dfs(grid, row-1, col, visited, cnt);
        dfs(grid, row+1, col, visited, cnt);
        dfs(grid, row, col-1, visited, cnt);
        dfs(grid, row, col+1, visited, cnt);
        
        return;
    }
}

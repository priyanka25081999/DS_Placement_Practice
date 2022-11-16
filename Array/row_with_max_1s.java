// Array : Row with max 1s
// GFG : https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=row-with-max-1s
// Approach-1 : Simple approach
// Time complexity : O(N*M)
// Space complexity : O(1)

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max = 0, row=-1;
        
        for(int i=0; i<n; i++) {
            int cnt=0;
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 1)
                    cnt++;
            }
            
            if(max < cnt) {
                max = cnt;
                row=i;
            }
        }
        
        return row;
    }
}

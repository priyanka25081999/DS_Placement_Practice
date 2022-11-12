// Array : Linear Search
// GFG : https://practice.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win
// Time complexity : O(N)
// Space complexity : O(1)

class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        for(int i=0; i<N; i++)
        {
            if(arr[i] == K)
                return 1;
        }
        return -1;
    }
}

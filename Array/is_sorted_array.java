// Array : Check if an array is sorted or not
// GFG : https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted
// Time complexity : O(N^2)
// Space complexity : O(1)

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] > arr[j])
                    return false;
            }
        }
        
        return true;
    }
}

// Array : Find the number of occurances of an element in sorted array
// Binary search approach
// find the first and last occurance and get the count (last-first+1)
// GFG : https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1

class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int cnt = 0, first = -1, last = -1, start = 0, end = n-1;
        
        // get the 1st occurance
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            
            if(arr[mid] == x)
            {  first = mid;
               end = mid-1;
            }
            else if(x < arr[mid])
               end = mid-1;
            else
               start = mid+1;
        }
        
        // get the last occurance
        start = 0;
        end = n-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            
            if(arr[mid] == x)
            {  last = mid;
               start = mid+1;
            }
            else if(x < arr[mid])
               end = mid-1;
            else
               start = mid+1;
        }
        
        if (first == -1 || last == -1)
           return 0;
        
        cnt = last-first+1;
        return cnt;
    }
}

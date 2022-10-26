// Array : Find the second largest element of an array
// GFG : https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
// Approach-1 : Sort the array and return n-2th element
// Time complexity : O(NlogN)
// Space complexity : O(1)

class Solution {
 int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        return arr[n-2];
  }
}

// Approach-2 : Two pass
// Time complexity: O(N), We do two linear traversals in our array
// Space complexity : O(1)

class Solution {
 int print2largest(int arr[], int n) {
        // code here
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        
        // find the maximum element
        for(int i=0; i<n; i++)
        {
            max = Math.max(max, arr[i]);
        }
        
        // find the second max element
        for(int i=0; i<n; i++)
        {
            if(arr[i]!=max && arr[i] > second_max)
                second_max = arr[i];
        }
        
        if(second_max == Integer.MIN_VALUE)
            return -1;
        return second_max;
  }
}

// Approach-3 : One/Single pass - Optimized approach
// Time complexity : O(N), We do one linear traversals in our array
// Space complexity : O(1)
class Solution {
    int print2largest(int arr[], int n) {
        // code here      
        int max = Integer.MIN_VALUE, second_max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            if(max < arr[i])
            {
                second_max = max;
                max = arr[i];
                
            }
            else if(arr[i]!=max && second_max < arr[i])
                second_max = arr[i];
        }
        
        if(second_max == Integer.MIN_VALUE)
            return -1;
            
        return second_max;
    }
}


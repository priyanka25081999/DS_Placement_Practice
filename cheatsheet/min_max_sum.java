// Array : Find the sum of minimum and maximum element of an array
// GFG : https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/


class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        Arrays.sort(A);
        
        return A[0]+A[N];
    }
}

// Time complexity : O(nlogn) assume using quick/merge sort for sorting

// Array : Chocolate distribution problem
// GeeksForGeeks - https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1/#
// Simple and efficient solution
// Time complexity - O(nlogn) (as we sort the list)

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        // If m and n are zero then return zero
        if(n==0 || m==0)
          return 0;
        
        // if number of chocolates are less than the students
        // then return -1
        if(n < m)
          return -1;
          
        // sort the list 
        Collections.sort(a);
        long min_diff = Long.MAX_VALUE;
        int i=0, j=m-1; // j=m-1, we want subarray of m size
        
        while(j<n)
        {
            // subtract the min from max in subarray 
            // find the minimum value 
            min_diff = Math.min(min_diff, a.get(j)-a.get(i));
            i++;
            j++;
        }
        // return the minimum difference
        return min_diff;
    }
}

// Array : 3Sum with multiplicity 
// Brute force approach (Getting TLE) - WIP
// https://leetcode.com/problems/3sum-with-multiplicity/

class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int count=0;
        int i,j,k;
        
        for(i=0; i<arr.length; i++)
        {
            for(j=i+1; j<arr.length; j++)
            {
                for(k=j+1; k<arr.length; k++)
                {
                    if(i<j && j<k)
                    {
                        if(arr[i] + arr[j]+arr[k] == target)
                            count++;
                    }
                }
            }
        }
        
        return count;
    }
}

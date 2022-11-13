// Array : Find the repeat and missing number
// Coding Ninjas : https://www.codingninjas.com/codestudio/problems/873366?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int arr1[]=new int[arr.size()];
        int a[]=new int[arr.size()];
        
        // convert an arraylist into array
        for(int i=0; i<arr.size(); i++)
            arr1[i] = arr.get(i);
        
        // sort the array
        Arrays.sort(arr1);
        
        // compare 1st element
        int ele=1;
        while(ele<=arr.size())
        {
            if(!(arr.contains(ele)))
                a[0] = ele;
            ele++;
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr1[i] == arr1[j])
                    a[1] = arr1[i];
            }
        }
        
        return a;
    }
}

// Array : Find missing number
// Leetcode : https://leetcode.com/problems/missing-number/
// Approach-2 : Using linear search
// Time complexity : O(N)
// Space complexity : O(1)

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i;
        
        for(i=0; i<n; i++)
        {
            if(nums[i] != i)
                break;
        }
        return i;
    }
}

// Array : Find missing number
// GFG : https://practice.geeksforgeeks.org/problems/missing-number4257/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=missing-number
// Approach-3 : Using temp array
// Time complexity : O(N)
// Space complexity : O(N), as we are using temp array to store the elements (i.e extra space)

class Compute {
    
    public static int missingNumber(int arr[], int N)
    {
        // Your code goes here
        int temp[] = new int[N+1];
        
        // initialize the positions to 0
        for(int i=0; i<N; i++)
            temp[i] = 0;
            
        // Now, if we find the element in an array, then add 1
        for(int i=0; i<N-1; i++)
            temp[arr[i] - 1] = 1;
        
        // If the element is not exists then the position holds 0, which is our missing number
        // So, store it into the ans and return it.
        int ans=0;
        for(int i=0; i<N; i++) {
            if(temp[i] == 0)
                ans=i+1;
        }
        return ans;
    }
}

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

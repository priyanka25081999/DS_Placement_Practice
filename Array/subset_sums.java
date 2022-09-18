// Recursion : Subset sums
// GFG : https://practice.geeksforgeeks.org/problems/subset-sums2234/1
// Time complexity : O(2^n)+O(2^n log(2^n)). Each index has two ways. You can either pick it up or not pick it. 
// So for n index time complexity for O(2^n) and for sorting it will take (2^n log(2^n)).
// Space complexity : O(2^n) for storing subset sums, since 2^n subsets can be generated for an array of size n.
// Refer my notes - https://github.com/priyanka25081999/DS_Placement_Practice/blob/main/my%20notes/recursion.md
// Also, refer striver link - https://takeuforward.org/data-structure/subset-sum-sum-of-all-subsets/

class Solution{

    void func(int index, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> list1)
    {
        if(index == N)
        {   
            list1.add(sum);
            return;
        }
        
        // pick this index
        // as we are picking this index, we need to add it with sum
        func(index+1, sum+arr.get(index), arr, N, list1);
        
        // do not pick this index
        // so sum remains as it is - no increament
        func(index+1, sum, arr, N, list1);
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        func(0, 0, arr, N, res);
        return res;
    }
}

// From coding ninja - https://www.codingninjas.com/codestudio/problems/subset-sum_3843086?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0

import java.util.* ;
import java.io.*; 
public class Solution {
    
    public static void func(int index, int sum, int num[], int N, ArrayList<Integer> list1)
    {
        if(index == N)
        {
            list1.add(sum);
            return;
        }
        
        // pick this index
        func(index+1, sum+num[index], num, N, list1);
        // do not pick this index
        func(index+1, sum, num, N, list1);
    }
    
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> res = new ArrayList<Integer>();
        func(0, 0, num, num.length, res);
        
        // sort the result list
        Collections.sort(res);
        return res;
    }

}

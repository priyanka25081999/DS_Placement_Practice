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

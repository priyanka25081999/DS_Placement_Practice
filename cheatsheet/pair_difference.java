// Array : Find Pair Given Difference 
// GFG : https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1/#
// HashSet Data structure : O(n)

class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        HashSet<Integer> hset = new HashSet<>();
        
        for(int i : arr)
        {
            // we found the pair = i and hset element
            if(hset.contains(Math.abs(n-i)) || hset.contains(Math.abs(n+i)))
               return true;
               
            // add an element (unique) in hashset
            hset.add(i);
        }
        
        return false;
    }
}

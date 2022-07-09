// Array : Common elements
// GFG : https://practice.geeksforgeeks.org/problems/common-elements1132/1/#
// Linear approach : HashSet data structure

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        HashSet<Integer> hset1 = new HashSet<>();
        HashSet<Integer> hset2 = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i : A)
        {
            // add all elements (except duplicates) in hashset
            hset1.add(i);
        }
        
        for(int i : B)
        {
            // if an element present in hashset1, then only add in hashset2 (add common elements)
            if(hset1.contains(i))
                hset2.add(i);
        }
        
        for(int i : C)
        {
            // if an element is present at hashset2 and doesn't present in
            // final result list, then add an element into res arraylist
            if(hset2.contains(i))
              if(!res.contains(i))
                res.add(i);
        }
        
        return res;
    }
}

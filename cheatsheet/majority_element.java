// Array : Find the majority element
// GFG : https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1/#
// HashMap approach

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        Arrays.sort(a);
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<size; i++)
        {
            hmap.put(a[i], hmap.getOrDefault(a[i], 0)+1);
        }
        
        int major = size/2;
        for(int i=0; i<size; i++)
        {
            int freq = hmap.get(a[i]);
            if(freq > major)
              return a[i];
        }
        
        return -1;
    }
}

/* 2nd approach 

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        Arrays.sort(a);
        return a[size/2];
    }
}

*/

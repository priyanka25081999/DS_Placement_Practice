// Array : Given an array of N integers. Find the first element that occurs K number of times. 
// GeeksForGeeks - HashMap approach
// https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1/?page=1&curated[]=1&curated[]=7&sortBy=submissions#

class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        // declare the hashmap
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i : a)
        {
            // if element exist in the map, then increase the count by 1
            // check the count with k
            if(hmap.containsKey(i))
            {
                hmap.put(i, hmap.getOrDefault(i,0)+1);
                
                if(hmap.get(i) == k)
                {   
                    return i;
                }
            }
            else
            {
                // if element doesn't exist in the map, then add the element
                // and check the count with k
                hmap.put(i, 1);
                if(hmap.get(i) == k)
                {
                    return i;
                }
            }
        }
        
        return -1;
    } 
}

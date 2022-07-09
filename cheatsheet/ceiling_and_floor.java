// Array : Ceiling and floor 
// Linear search approach
// GFG : https://practice.geeksforgeeks.org/problems/ceil-the-floor2802/1#

class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        
        int min=Integer.MAX_VALUE, max=-1;
        
        for(int i : arr)
        {
            // find the floor
            if(i <= x)
               max = Math.max(i, max);
        }
        
        for(int i: arr)
        {
            // find the ceil
            if(i >= x)
               min = Math.min(i, min);
        }
        
        if(min == Integer.MAX_VALUE)
          min = -1;
          
        Pair res = new Pair(max, min);
        return res;
    }
}

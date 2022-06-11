// Find minimum and maximum element in an array  
// GeeksForGeeks : https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1/

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Arrays.sort(a);
        
        pair minmax = new pair(0,0);
        minmax.first = a[0];
        minmax.second = a[(int)n-1];
        return minmax;
    }
}

// Linear Search
// Time complexity - O(n)
// Space complexity - O(1) as no extra space was needed.

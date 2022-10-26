// Array : Largest array element
// GFG : https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array
// Approach-1 : sort the array and return the last array element
// Time complexity : O(NlogN)
// Space complexity : O(1)

class Compute {
    
    public int largest(int arr[], int n)
    {
        Arrays.sort(arr);
        return arr[n-1];
    }
}

// Approach-2 : Maintain the max element and compare it with array elements to get the maximum element
// Time complexity : O(N), where N means total number of elements
// Space complexity : O(1)

class Compute {
    
    public int largest(int arr[], int n)
    {
        // Arrays.sort(arr);
        // return arr[n-1];
        
        int max = arr[0];
        for(int i=1; i<n; i++)
        {
            if(max <= arr[i])
                max = arr[i];
        }
        
        return max;
    }
}

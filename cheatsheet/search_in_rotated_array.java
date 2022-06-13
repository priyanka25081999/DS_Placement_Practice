// Array : Search an element in a sorted and rotated array
// GeeksForGeeks - https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1/#
// Binary Search approach - O(logn)
// Please check this link for more approaches and better understanding - https://github.com/priyanka25081999/DS_Placement_Practice/blob/main/Array/search_in_rotated_array.java

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // Complete this function
        int mid;
        
        while(l<=h)
        {
            mid = l+(h-l)/2;
            
            if(A[mid] == key)
              return mid;
            else if(key > A[mid] && key < A[h])
              l = mid;
            else if(key < A[mid] && key > A[l])
              h = mid;
            else if(key == A[h])
              return h;
            
            h = h-1;
        }
        return -1;
    }
}

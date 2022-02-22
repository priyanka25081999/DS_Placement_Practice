// Binary serach approach : find peak index
// Link : https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Time complexity : O(logn)

public class Main
{
    static int peakIndexInMountainArray(int[] arr) {
        
        int start=0;
        int end = arr.length-1;
        int peak=-1;
        
        while(start<=end)
        {
            int mid = (start + end)/2; //(end-start)/2;
            
          // check if mid is greater than left and right element 
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
               return mid;
          // if mid is less than left element, then search in left part, bcz we are in decreasing side of an array
          // hence make end as mid element
            else if(arr[mid]<arr[mid-1])
               end = mid;
            else
               start = mid+1;
        }
        return peak;
    }
    
	public static void main(String[] args) {
		int arr[] = {3,5,3,2,0};
		int ans = peakIndexInMountainArray(arr);
		System.out.println(ans);
	}
}

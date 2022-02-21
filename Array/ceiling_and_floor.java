// Binary search approach
// Ceiling : Smallest element which is greater than or equal to target element
// floor : Largest element which is smaller than or equal to target element

/* Example
Input : arr[] = 2, 3, 5, 9, 14, 16, 18, target = 15
Output [array index] : Ceiling = 5 and floor = 4

Input : arr[] = 2, 3, 5, 9, 14, 16, 18, target = 5
Output [array index]: Ceiling = 2 and floor = 2 
*/

public class Main
{
    public static int ceiling(int arr[], int target)
    {
	// if target is greater than greatest element in the array, then return -1
        if (target > arr[arr.length-1])
           return -1;
	    
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if (arr[mid]==target)
                return mid;
            else if (target > arr[mid])
                start = mid+1;
            else 
                end = mid-1;
        }
        return start;
    }
    
    public static int floor(int arr[], int target)
    {
	// if target is smaller than smallest element in the array, then return -1
        // it will by default return -1 as start will go before index 0
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if (arr[mid]==target)
                return mid;
            else if (target > arr[mid])
                start = mid+1;
            else 
                end = mid-1;
            
        }
        return end;
    }
    
	public static void main(String[] args) {
	    int arr[] = {2, 3, 5, 9, 14, 16, 18};
	    int target = 15;
	    
	    int ans_ceiling = ceiling(arr, target);
	    int ans_floor = floor(arr, target);
	    
	    System.out.println("Ceiling of a " + target + " is = " + ans_ceiling);
	    System.out.println("Floor of a " + target + " is = " + ans_floor);
	}
}

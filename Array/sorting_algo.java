// Selection sort
// Time complexity : O(N^2)

void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0; i<n; i++) 
	    {
	        int min_index = i;
	        for(int j=i+1; j<n; j++)
	        {
	            // find the smallest element
	            if(arr[j] < arr[min_index])
	                min_index = arr[j];
	                
	            int temp = arr[j];
	            arr[j] = min_index;
	            min_index = temp;
	        }
	    }
	}

// cyclic sort
// If a range is given from 1..N, directly apply cyclic sort
// Time complexity : O(n)

public class Main
{
	public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        int len = arr.length;
        
        // compare, swap, move
        for(int i=0; i<len;)
        {   int correct_index = arr[i]-1;
         
            if(arr[i] != arr[correct_index])
            {
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            }
            else
            {   // if equal then move ahead.
                i++;
            }
        }
        
        // print the sorted array
        for(int i=0; i<len; i++)
        {
            System.out.println(arr[i]);
        }
	}
}

/* package codechef; // don't place package name! */
// codechef challenge

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RacingHorse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int i=0; i<tc; i++)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    int final_ans=Integer.MAX_VALUE;
		    
		    for(int j=0; j<n; j++)
		    {
		        arr[j] = sc.nextInt();
		    }
		    
		    for(int j=0; j<n; j++)
		    {
		        for(int k=j+1; k<n; k++)
		        {
		             int ans = Math.abs(arr[j]-arr[k]);
		             final_ans=Math.min(ans,final_ans);
		        }
		    }
		    System.out.println(final_ans);
		}
	}
}

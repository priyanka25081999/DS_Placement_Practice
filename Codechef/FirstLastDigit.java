//If Give an integer N . Write a program to obtain the sum of the first and last digits of this number.

import java.util.*;

public class FirstLastDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		
		int arr[] = new int[tc];
		for(int i=0; i<tc; i++)
		{
		    arr[i] = sc.nextInt();
		    int n=arr[i];
		    int first=0,last=0,flag=0;
		    
		    while(n!=0)
		    {
		        int rem = n%10;
		        if(flag==0)
		        {
		            last=rem; // last digit
		            flag++;
		        }
		        first=n;      // first digit
		        n=n/10;
		    }
		    
		    int sum=last+first; // addition
	        arr[i]=sum;
		}
		
		for(int i=0; i<tc; i++)
		{
		    System.out.println(arr[i]);
		}
	}
}

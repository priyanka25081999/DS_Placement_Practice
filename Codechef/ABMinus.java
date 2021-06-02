/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans=a-b;
		int rem=ans%10;
		ans=ans/10;
		
		int new_ans=rem+1;
		if(new_ans>9)
		  new_ans=1;
		if(new_ans==rem)
		  new_ans=new_ans+1;
		  
		ans=(ans*10)+new_ans;
		System.out.println(ans);
	}
}

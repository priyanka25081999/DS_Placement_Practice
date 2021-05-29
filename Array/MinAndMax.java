/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		int []arr = new int[]{31,32,13,54,75};

		Arrays.sort(arr);
		
		System.out.println("Min Element: " + arr[0]);
		System.out.println("Max Element: " + arr[arr.length-1]);
	}
}

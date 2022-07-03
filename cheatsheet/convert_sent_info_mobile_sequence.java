// String Array : Convert a sentence into its equivalent mobile numeric keypad sequence
// Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence. 
// GFG : https://practice.geeksforgeeks.org/problems/convert-a-sentence-into-its-equivalent-mobile-numeric-keypad-sequence0547/1#

// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        // Create a number array here
        String number[] = {
            "2", "22", "222",
            "3", "33", "333",
            "4", "44", "444",
            "5", "55", "555",
            "6", "66", "666",
            "7", "77", "777", "7777",
            "8", "88", "888",
            "9", "99", "999", "9999"
        };
        
        // find the length of input string
        int n = S.length();
        
        // create an output string
        String output = "";
        
        if (n == 0)
          return output;
          
        for(int i=0; i<S.length(); i++)
        {
            // Check for the space. If space, then add the "0"
            if (S.charAt(i) == ' ')
              output = output+ "0";
            else
            {
                // allocate the proper number from number[] array
                int position_of_char = S.charAt(i)-'A';
                output = output + number[position_of_char];
            }
        }
        
        return output;
    }
}

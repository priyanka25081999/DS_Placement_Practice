// String : Reverse a string
// https://practice.geeksforgeeks.org/problems/reverse-a-string/1#

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
      // Reverse the string str
      String ans = "";
  
      for(int i = str.length()-1; i>=0; i--)
      {
          ans = ans + str.charAt(i);
      }
      
      return ans;
    }
}

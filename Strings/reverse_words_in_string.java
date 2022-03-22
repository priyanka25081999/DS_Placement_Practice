// String : Reverse words in a String 
// Normal approach : String builder and reverse the string
// Second approach would be to use stack
// Push words into stack one by one until we get space " ".
// then pop words from stack and append them into another string
// https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {
        
        // convert into string array
        String str[] = s.split(" ");
        // str array looks like : str[]={"Let's", "take", "LeetCode", "contest"};
        StringBuilder sb;
        
        for(int i=0; i<str.length; i++)
        {
           // Convert the string 
           sb = new StringBuilder(str[i]);
            
           // reverse and convert the word into string again
           str[i] = sb.reverse().toString();
        }
        
        // Combine the reverse words from array into the string
        String reverse = "";
        for(int i=0; i<str.length; i++)
        {
            reverse = reverse + str[i] + " ";
        }
        
        // Remove the last/first extra spaces
        return reverse.trim();
    }
}

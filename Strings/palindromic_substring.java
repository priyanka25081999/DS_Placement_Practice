// String : Palindromic Substring
// Leetcode : https://leetcode.com/problems/palindromic-substrings/

class Solution {
    
    int count = 0;
    
    public int countSubstrings(String s) {
        for(int i=0; i<s.length(); i++)
        {
            // for odd length of palindrome
            count_palindromes(s, i, i);
            
            // for even length of palindrome
            count_palindromes(s, i, i+1);
        }
        return count;
    }
    
    public void count_palindromes(String s, int i, int j)
    {
        while(i>=0 && j<s.length() && (s.charAt(i) == s.charAt(j)))
        {   count++;
            i = i-1; // go left
            j = j+1; // go right
        }
    }
}


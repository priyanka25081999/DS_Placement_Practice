// String : Palindromic Substring
// Leetcode : https://leetcode.com/problems/palindromic-substrings/

class Solution {
    
    int count = 0;
    
    public int countSubstrings(String s) {
        for(int i=0; i<s.length(); i++)
        {
            // to get count of odd length palindrome strings (a/aaa/...)
            count_palindrome(s, i, i);
            
            // to get count of even length palindrome strings (aa/abba/...)
            count_palindrome(s, i, i+1);
        }
        return count;
    }
    
    public void count_palindrome(String s, int left, int right)
    {
        // check if left and right characters are same
        // if yes, then increase the counter, decrease the left by 1 
        // and increase the right by 1
        while(left>=0 && right<s.length() && (s.charAt(left) == s.charAt(right)))
        {
            count++;
            left--;
            right++;
        }
    }
}

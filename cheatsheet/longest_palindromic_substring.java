// String : Longest Palindromic Substring
// Leetcode : https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    String final_str = "";
    public String longestPalindrome(String s) {
        for(int i=0; i<s.length(); i++)
        {
            // odd length palindrome
            count_palindrome(s, i, i);
            // even length palindrome
            count_palindrome(s, i, i+1);
        }
        return final_str;
    }
    
    public void count_palindrome(String s, int left, int right)
    {
        while(left>=0 && right<s.length() && (s.charAt(left) == s.charAt(right)))
        {
            left--;
            right++;
        }
        
        // find the length of substring
        // add it to the final string if substring length is greater
        String temp = s.substring(left+1, right);
        if(final_str.length() < temp.length())
            final_str = temp;
    }
}

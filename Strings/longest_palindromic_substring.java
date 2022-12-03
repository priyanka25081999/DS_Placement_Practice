// String : Longest Palindromic Substring
// Leetcode : https://leetcode.com/problems/longest-palindromic-substring/
// Time complexity : O(N)
// Space complexity : O(1)

class Solution {
    String longest_string = "";
    public String longestPalindrome(String s) {
        for(int i=0; i<s.length(); i++) {
            // odd length strings
            checkPalindromeString(s, i, i);
            // even length strings
            checkPalindromeString(s, i, i+1);
        }
        
        return longest_string;
    }
    
    public void checkPalindromeString(String s, int left, int right) {
        while(left>=0 && right<s.length() && (s.charAt(left) == s.charAt(right))) {
            left--;
            right++;
        }
        
        // get the substring here. here, left+1, +1 to avoid index out of range exception
        // here left index may go beyond 0 or -1 due to above for loop. To avoid that and we always get the left char starting from 0th index, hence do left+1
        String temp = s.substring(left+1, right);
        
        if(longest_string.length() < temp.length())
            longest_string = temp;        
    }
}

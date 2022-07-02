// String : Valid palindrome
// Leetcode : https://leetcode.com/problems/valid-palindrome/
// Two Pointers approach

class Solution {
    public boolean isPalindrome(String s) {
        // Two pointers approach
        // first, convert into lowercase
        s = s.toLowerCase();
        int start = 0, end = s.length()-1;
        
        while(start<end)
        {
            char a = s.charAt(start);
            char b = s.charAt(end);
            
            // increament the pointers if the character is not letter or digit
            if(!Character.isLetterOrDigit(a))
                start++;
            else if(!Character.isLetterOrDigit(b))
                end--;
            else
            {
                // if they are alphabet/digit, then compare the characters
                if(a!=b)
                  return false;
                
                start++;
                end--;
            }
        }
        
        return true;
    }
}

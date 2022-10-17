// Stack : Valid Palindrome
// Leetcode : https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        String ans1="";
        String ans2="";
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))
            {   
                ans1 = ans1+Character.toLowerCase(s.charAt(i));
                st.push(Character.toLowerCase(s.charAt(i)));
            }
        }
                
        for(int i=0; i<s.length(); i++)
        {
            if(st.isEmpty()==false) {
                ans2 = ans2 + st.pop();
            }
        }
        
        return ans1.equals(ans2);
    }
}

// Approch2 - Two pointers

class Solution {
    public boolean isPalindrome(String s) {
        int st = 0, end=s.length()-1;
        s = s.toLowerCase();
        
        while(st<end)
        {
            char st_char = s.charAt(st);
            char end_char = s.charAt(end);
            
            if(!Character.isLetterOrDigit(st_char))
                st++;
            else if(!Character.isLetterOrDigit(end_char))
                end--;
            else
            {
                if(st_char!=end_char)
                    return false;
                st++;
                end--;
            }
        }
        
        return true;
    }
}

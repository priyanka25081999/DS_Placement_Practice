// Stack : determine if the input string(parentheses) is valid.
// https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        int i;
        for(i=0; i<s.length(); i++)
        {
            // push the opening parentheses
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                st.push(s.charAt(i));
            // check if the stack top element and current element are equal, and if stack is not empty
            // then pop the element from stack
            // else simply return false
            else if(s.charAt(i) == ')')
            {
                if(!st.empty() && st.peek() == '(')
                    st.pop();
                else
                    return false;
            }
            else if(s.charAt(i) == ']')
            {
                 if(!st.empty() && st.peek() == '[')
                    st.pop();
                else
                    return false;
            }
            else if(s.charAt(i) == '}')
            {
                if(!st.empty() && st.peek() == '{')
                    st.pop();
                else
                    return false;
            }
        }
        
        // At the end, if stack is empty, it means parenthese are valid and returns true
        // otherwise, return false.
        if(st.isEmpty())
            return true;
        else
            return false;
    }
}

// Approach-2, using stack
// Time complexity : O(N)
// Space complexity : O(N)

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='(' || ch=='[' || ch=='{')
                st.push(ch);
            else
            {
                if(st.isEmpty())
                    return false;
                char top_ch = st.pop();
                if((top_ch=='(' && ch==')') || (top_ch=='{' && ch=='}') || (top_ch=='['&& ch==']'))
                   continue;
                else
                   return false;
            }
                
                
        }
        
        return st.isEmpty();
    }
}

// Stack : Valid parentheses
// Leetcode : https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            // push the opening brackets into the stack
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i)=='[')
                st.push(s.charAt(i));
            // pop the closing bracket from the stack if stack is not empty and it matches the criteria
            else if((s.charAt(i) == ')' && !st.empty() && st.peek() == '(') || (s.charAt(i) == '}' && !st.empty() && st.peek() == '{') || (s.charAt(i) == ']' && !st.empty() && st.peek() == '['))
                    st.pop();
            else
               return false;
            
        }
        
        // return true if stack is empty, else false
        return st.isEmpty();
    }
}

// String : Remove outermost parentheses
// Leetcode : https://leetcode.com/problems/remove-outermost-parentheses/
// Approach-1 : Using stack data structure
// Time complexity : O(N)
// Space complexity : O(N), as we are using stack

class Solution {
    public String removeOuterParentheses(String s) {
        Stack st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            
            // if it's the first parentheses that mean it is the outermost
            // and let's not add it into our output sb string
            // but push it into the stack
            if(st.empty() && ch == '(')
                st.push(ch);
            else if(!st.empty() && ch == '(')
            {
                // else add it into the stack and result string
                st.push(ch);
                sb.append(ch);
            }
            // now, if it is the closing bracket and stack contains only one opening bracket
            // then simply remove the opening bracket, do not add any of them into the output string. remove the outermost closing bracket
            else if(st.size() == 1 && ch == ')')
                st.pop();
            else if(st.size() > 1 && ch == ')')
            {
                // else pop the opening bracket from stack
                // and add the closing bracket into the result string
                st.pop();
                sb.append(ch);
            }
        }
        
        // convert stringbuilder to string
        return sb.toString();
    }
}

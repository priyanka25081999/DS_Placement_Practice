// DP : Climbing Stairs
// Stack approach
// https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        // Create a stack
        Stack<Integer> st = new Stack<>();
        
        // Push 2 values in stack
        st.push(1);
        st.push(1);
        
        for(int i=2; i<=n; i++)
        {
            // Pop first 2 values from the stack
            int no1 = st.pop();
            int no2 = st.pop();
            
            // again push the new values in the stack
            st.push(no1);
            st.push(no1+no2);
        }
        // return the top value of stack
        return st.pop();
    }
}

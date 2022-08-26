// DP : Climbling Stairs
// Leetcode : https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(1);
        
        for(int i=2; i<=n; i++)
        {
            int no1 = st.pop();
            int no2 = st.pop();
            
            st.push(no1);
            st.push(no1+no2);
        }
        
        return st.pop();
    }
}

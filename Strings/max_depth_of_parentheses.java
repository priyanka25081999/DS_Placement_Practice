// String : Maximum Nesting Depth of the Parentheses
// Leetcode : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
// Approach-1 : Using Stack
// Time complexity : O(N)
// Space complexity : O(N) - as we are using stack ds to store parentheses.

class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max_cnt = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                st.push(s.charAt(i));
                
                max_cnt = Math.max(max_cnt, st.size());
            }
            else if(s.charAt(i) == ')')
                st.pop();
        }
        
        return max_cnt;
    }
}

// Approach-2 : Optimized approach
// Time complexity : O(N)
// Space complexity : O(1) - as we are not using any extra space.

class Solution {
    public int maxDepth(String s) {
        int current_cnt=0, max_cnt=0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(')
                current_cnt++;
            else if(s.charAt(i) == ')')
                current_cnt--;
            
            max_cnt = Math.max(max_cnt, current_cnt);
        }
        
        return max_cnt;
    }
}

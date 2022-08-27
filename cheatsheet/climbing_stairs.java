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

// DP : bottom-up approach
// Always remember: last two elements i.e (n-1 and n) are always 1. At the end, you will get the fibonacci series
// Here in this problem, we require to maintain the last two elements, hence maintaining an array is not required. 
// We can use two variables
// Time complexity: O(n) 

class Solution {
    public int climbStairs(int n) {
        int one=1, two=1;
        
        for(int i=0; i<n-1; i++)
        {
            int temp = one;
            one = one+two;
            two = temp;
        }
        
        return one;
    }
}

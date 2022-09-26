// DP : Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/

// Tabulation approach
// Time complexity : O(N) - We are running a simple iterative loop
// Space complexity : O(N) - We are using an external array of size ‘n+1’.

class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr, -1);
        
        arr[0]=1;
        arr[1]=1;
        
        for(int i=2; i<=n; i++)
            arr[i] = arr[i-1]+arr[i-2];
        
        return arr[n];
    }
}

// Space optimization of above solution
// Time complexity : O(N) - We are running a simple iterative loop
// Space complexity : O(1) - We are not using any extra space.
class Solution {
    public int climbStairs(int n) {
        int one=1, two=1;
        
        for(int i=2; i<=n; i++)
        {
            int temp = one;
            one = one+two;
            two = temp;
        }
        
        return one;
    }
}

// Stack approach
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

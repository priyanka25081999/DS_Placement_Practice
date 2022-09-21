// Stack : Next greater element II
// Leetcode : https://leetcode.com/problems/next-greater-element-ii/
// Time complexity : O(N)

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // Brute force (if we consider non-circular array) 
        // check at the right side of an array
        // 2 forloops and find next greater element - O(n^2)
        int n = nums.length;
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i=2*n-1; i>=0; i--)
        {
            while(st.isEmpty() == false && st.peek()<=nums[i%n])
            {
                //if lesser then pop
                st.pop();
            }
            
            if(i<n)
            {
                //get the next greatest element
                if(st.isEmpty() == false)
                    nge[i] = st.peek();
                else
                    nge[i] = -1;
            }
            
            // push the current element
            st.push(nums[i%n]);
        }
        
        return nge;
    }
}

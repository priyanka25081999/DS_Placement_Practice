// Stack : Baseball game
// https://leetcode.com/problems/baseball-game/

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<Integer>();
        
        int final_sum = 0;
        for(int i=0; i<ops.length; i++)
        {  
            // If "C" -> removes element from stack
            if(ops[i].equals("C"))
            {
                st.pop();
            }
            else if(ops[i].equals("D"))
            {
                // If "D" -> get the peek, double it and push the result in stack
                int no = st.peek();
                st.push(no*2);
            }
            else if(ops[i].equals("+"))
            {
                // If "+" -> Get the top element, get the latest peek now
                // add them, push popped element(1st no) and finally push the addition result
                int no1 = st.pop();
                int no2 = st.peek();
                st.push(no1);
                st.push(no1+no2);
            }
            else
            {
                // for all remaining integers
                // push them in the stack
                st.push(Integer.parseInt(ops[i]));
            }
        }
       
        // add the all elements of stack, until stack becomes empty
        while(!st.empty())
        {
            // pop the element and add it with final_sum
            final_sum = final_sum + st.pop();
        }
        
        // return the sum of all the scores (i.e. elements)
        return final_sum;
    }
}

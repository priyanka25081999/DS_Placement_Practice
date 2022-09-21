// Stack : Implement a first in first out (FIFO) queue using only two stacks.
// https://leetcode.com/problems/implement-queue-using-stacks/
// Time complexity: Push operation - O(1) and Pop operation - O(N)

class MyQueue {
    
    Stack<Integer> st1;
    Stack<Integer> st2;
    
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        // push the elements from stack1 into stack2
        // and pop the 1st element from stack2
        
        if(st2.empty())
        {
            while(!st1.empty())
            {
                st2.push(st1.pop());
            }
        }
        return st2.pop();
    }
    
    public int peek() {
        // push the elements from stack1 into stack2
        // and return the top element from stack2
        
        if(st2.empty())
        {
            while(!st1.empty())
            {
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }
    
    public boolean empty() {
        return st1.empty() && st2.empty();
    }
}

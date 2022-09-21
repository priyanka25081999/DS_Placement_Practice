// Stack and Queue : Implement the stack using queues
// Leetcode : https://leetcode.com/problems/implement-stack-using-queues/
// Time complexity : O(1)
// Approach : Instead of using 2 queues, we can do it in one single queue

/*
1. Take a single queue.
2. push(x): Push the element in the queue.
3. Use a for loop of size()-1, remove element from queue and again push back to the queue, 
   hence the most recent element becomes the most former element and vice versa.
4. pop(): remove the element from the queue.
5. top(): show the element at the top of the queue.
6. size(): size of the current queue.

Note: Repeat step3 at every insertion of the element.
*/

class MyStack {
    Queue<Integer> q1;
    
    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
        for(int i=0; i<q1.size()-1; i++)
            q1.add(q1.remove());
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

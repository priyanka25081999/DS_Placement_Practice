// Stack : Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

class MinStack {
    Stack<Integer> st;
    int min;
    public MinStack() {
        st = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        min = Math.min(min, val);
        st.push(val);
        st.push(min);
    }
    
    public void pop() {
        st.pop();
        st.pop();
        if(st.empty())
            min = Integer.MAX_VALUE;
        else
            min = st.peek();
    }
    
    public int top() {
        int para = st.pop();
        int element = st.peek();
        
        st.push(para);
        return element;
    }
    
    public int getMin() {
        return st.peek();
    }
}

// Stack: Implement a stack using an array
// Time Complexity: O(1)

class stack
{
    int max = 100;
    int arr[] = new int[max];
    int top= -1;
    
    int pop()
    {
        if(top==-1) 
        {
            System.out.println("Stack underflow...!");
            return -1;
        }
        else
          return arr[top--];
    }
    
    void push(int x)
    {
        top++;
        if(top==max)
            System.out.println("Stack overflow...!");
        arr[top]=x;
    }
    
    int top()
    {
        return arr[top];
    }
    
    int size()
    {
        return top+1;
    }
    
}


public class Main
{
	public static void main(String[] args) {
		stack s = new stack();
		s.push(10);
		s.push(20);
		System.out.println("Top : "+s.top());
		s.push(30);
        System.out.println("Size : "+s.size());
        System.out.println("Delete element : "+s.pop());
		System.out.println("Size : "+s.size());
		System.out.println("Top : "+s.top());
		System.out.println("Delete element : "+s.pop());
		System.out.println("Size : "+s.size());
		System.out.println("Top : "+s.top());
	}
}


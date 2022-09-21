// Queue: Implement queue using an array
// Time complexity: O(1)

class queue
{
    int max = 100;
    int arr[] = new int[max];
    int front= -1, rear=-1;
    
    int delete()
    {
        if(front>rear) 
        {
            System.out.println("Queue is empty...!");
            return -1;
        }
        
        return arr[front++];
    }
    
    void insert(int x)
    {
        if(rear==-1 && front ==-1)
        {
            rear=0;
            front=0;
            //arr[rear]=x;
        }
        if(rear==max)
            System.out.println("Stack overflow...!");
            
        arr[rear]=x;
        rear++;
    }
    
    int top()
    {
        return arr[front];
    }
    
    int size()
    {
        return rear;
    }
    
}


public class Main
{
	public static void main(String[] args) {
		queue q = new queue();
		q.insert(10);
		q.insert(20);
		System.out.println("Top : "+q.top());
		q.insert(30);
    System.out.println("Size : "+q.size());
    System.out.println("Delete element : "+q.delete());
		System.out.println("Size : "+q.size());
		System.out.println("Top : "+q.top());
		System.out.println("Delete element : "+q.delete());
		System.out.println("Size : "+q.size());
		System.out.println("Top : "+q.top());
	}
}

// Create a singly linked list

class Node
{
    int data;
    Node next;
    
    public Node(int data)
    {
       this.data=data;
    }
}

class SinglyLL
{
    Node head;
    Node n;
    
    public SinglyLL()
    {
        head=null;
        n=null;
    }
    
    public void print()
    {
        n=head;
        
        while(n!=null)
        {
            System.out.println("Data : "+n.data);
            n=n.next;
        }
    }
    
    public void insert(int data)
    {
        if(head==null)
        {
           Node node = new Node(data);
           head = node;
           head.next=null;
        }
        else
        {
            n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            
            Node node = new Node(data);
            n.next = node;
            n=n.next;
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		SinglyLL s = new SinglyLL();
		s.insert(5);
		s.insert(10);
		s.insert(7);
		s.insert(8);
		s.print();
	}
}

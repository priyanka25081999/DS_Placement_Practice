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
    
    public void insert_at_position(int data, int index)
    {
        if(index == 0)
        {
            Node node = new Node(data);
            node.next = head;
            head=node;
        }
        else
        {
            n=head;
            for (int i=1; i<index; i++)
            {
                n=n.next;
            }
            
            Node node = new Node(data);
            node.next = n.next;
            n.next = node;
        }
    }
    
    public void insert_recursion(int data, int index)
    {
        head = insert_rec(data, index, head);
    }
    
    private Node insert_rec(int data, int index, Node node)
    {
        if (index == 0)
        {
            Node new_node = new Node(data);
            return new_node;
        }
        node.next = insert_rec(data, index--, node.next);
        return node;
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
		
		System.out.println("Insert at specific position: ");
		s.insert_at_position(9,1);
		s.print();
		
		System.out.println("Recursion : Insert at specific position: ");
		s.insert_at_position(18,3);
		s.print();
	}
}

/* GFG question
// Linked List insertion at beginning and the end
// https://practice.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1/?page=1&category[]=Linked%20List&sortBy=submissions#

class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node temp = new Node(x);
        temp.next = head;
        head = temp;

        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node temp = new Node(x);
        if(head == null)
        {
            head = temp;
            return head;
        }
        
        Node p = head;
        while(p.next!=null)
        {
            p = p.next;
        }
        p.next = temp;
        
        return head;
    }
}

*/

/*

LinkedList : Count nodes of linked list
GFG : https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-nodes-of-linked-list
Time complexity : O(N), as we are visiting each node at least once
Space complexity : O(1)

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        int cnt=0;
        while(head!=null)
        {
            cnt++;
            head = head.next;
        }
        
        return cnt;
    }
}

*/


// Doubly Linked List operations

// DLL : Insertion at given position
// GFG : https://practice.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=insert-a-node-in-doubly-linked-list
// Time complexity : O(N), may need to traverse the nodes
// Space complexity : O(1), not using any extra space

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		
		Node nn = new Node(data);
		
		if(head_ref == null)
		{
		    nn.next=null;
		    nn.prev=null;
		    head_ref = nn;
		}

		for(int i=0; i<pos; i++)
		    head_ref = head_ref.next;
		    
		nn.next = head_ref.next;
	    head_ref.next = nn;
	    nn.prev = head_ref;
	    
	}
}

/*

DoublyLL : Delete a node in a doubly linkedlist
GFG : https://practice.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-node-in-doubly-linked-list
Time complexity : O(N), where N is the length of doubly linked list
Space complexity : O(1), extra space is not required

class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	    // Your code here
	    if(head == null)
	        return head;
	    
	    if(x == 1)
	    {
	        head = head.next;
	        return head;
	    }
	    
	    Node temp = head;
	    //reach to the target(x) node
	    while(x > 1) {
	        temp = temp.next;
	        x--;
	    }
	    
	    if(temp.next == null)
	        temp.prev.next = null;
	    else {
	        temp.prev.next = temp.next; // prev nodes pointer update
	        temp.next.prev = temp.prev; // next nodes pointer update
	    }
	    
	    return head;
    }
}

*/

/*

DoublyLL : Reverse a Doubly Linked List
GFG : https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reverse-a-doubly-linked-list
Time complexity : O(N)
Space complexity : O(1), not using any extra space

class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public static Node reverseDLL(Node head)
{
    //Your code here
    Node temp = null;
    Node curr = head;
    
    // change next and prev pointers
    while(curr!=null) {
        temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;
        curr = curr.prev;
    }
    
    // Edge case if our linked list is empty Or list with only one node or for the last node
    if(temp!=null) 
        head = temp.prev;

    return head;
}

*/

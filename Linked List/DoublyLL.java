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


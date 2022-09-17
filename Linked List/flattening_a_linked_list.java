// LinkedList : Flattening a Linked List
// GeeksForGeeks : https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1
// Time complexity : O(N) - where N is the total number of nodes present, we are visiting all the nodes present in the given list.
// Space complexity : O(1) - we are not creating any new nodes or using any other data structure.

class GfG
{
    public Node mergetwolists(Node list1, Node list2)
    {
        Node temp = new Node(0);
        Node res = temp;
        
        while(list1!=null && list2!=null)
        {
            if(list1.data < list2.data)
            {
                temp.bottom = list1;
                temp = temp.bottom;
                list1 = list1.bottom;
            }
            else
            {
                temp.bottom = list2;
                temp = temp.bottom;
                list2 = list2.bottom;
            }
        }
        
        if(list1 != null)
            temp.bottom = list1;
        else
            temp.bottom = list2;
            
        return res.bottom;
    }
    
    Node flatten(Node root)
    {
	    // Your code here
	    if (root == null || root.next == null)
	        return root;

	    root.next = flatten(root.next);
	    root = mergetwolists(root, root.next);
	    
	    return root;
    }
}


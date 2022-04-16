// Linked List : Remove a loop in Linked List
// https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1/?page=1&category[]=Linked%20List&sortBy=submissions#

// GFG problem
public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        boolean flag = false;
        if(head == null)
           return;
        
        Node fast = head, slow = head;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            // it's a loop
            if(fast == slow)
            {
                break;
            }
        }
        
        if (slow == head)
        {
            while(fast.next!=slow)
               fast = fast.next;
            
            fast.next = null;
        }
        else if(slow == fast)
        {
            slow = head;
            while(slow.next != fast.next)
            {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
        
    }

// LinkedList : Remove duplicates from an unsorted linked list
// GFG : https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // create a hashset
         HashSet<Integer> hset = new HashSet<>();
         Node current=head, prev=null;
         
         while(current!=null)
         {
            if(hset.contains(current.data))
              prev.next = current.next;
            else
            {
                hset.add(current.data);
                prev = current;
            }
             
             current = current.next;
         }
         
         return head;
    }
}


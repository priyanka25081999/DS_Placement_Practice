// LinkedList : Reorder list
// Leetcode : https://leetcode.com/problems/reorder-list/
// Stack approach
// Time complexity : O(N)
// Space complexity : O(N) as we are using stack to store elements

class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode tail=null, next=null, temp=head;
        int i=1, n=0;
        
        while(temp!=null)
        {
            n++;
            st.push(temp);
            temp=temp.next;
        }
        
        while(i<=n/2)
        {
            tail=st.pop();
            next=head.next;
            
            head.next=tail;
            tail.next=next;
            
            head=next;
            i++;
        }
        head.next=null;
    }
}

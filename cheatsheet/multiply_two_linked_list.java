// Linked list : Multiply two linked list
// GFG : https://practice.geeksforgeeks.org/problems/multiply-two-linked-lists/1/#

class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          //add code here.
          long N = 1000000007;
          long num1 = 0, num2 = 0;
          
          while(l1!=null || l2!=null)
          {
              if(l1 != null)
              {
                  num1 = ((num1)*10)%N + l1.data;
                  l1 = l1.next;
              }
              
              if(l2 != null)
              {
                  num2 = ((num2)*10)%N + l2.data;
                  l2 = l2.next;
              }
          }
        
        return ((num1%N)*(num2%N))%N;
   }
}

// Time Complexity: O(max(n1, n2)), where n1 and n2 represents the number of nodes present in the first and second linked list respectively.
// Space Complexity: O(1), no extra space is required, so it is a constant.

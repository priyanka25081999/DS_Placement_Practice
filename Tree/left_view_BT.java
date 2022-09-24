// Tree : Left view of Binary Tree
// GFG : https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
// Time complexity : O(N)

class Tree
{
    public void view(Node root, ArrayList<Integer> res, int curr_depth)
    {
        if(root==null)
            return; 
        // If list size is equal to the level 
        // then add its node value to the list.
        if(res.size()==curr_depth)
            res.add(root.data);
        
        view(root.left, res, curr_depth+1);
        view(root.right, res, curr_depth+1);
    }
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> res = new ArrayList<>();
      
      if(root==null)
        return res;

      view(root, res, 0);
      return res;
    }
}

// Binary Tree : Level Order Traversal
// https://leetcode.com/problems/binary-tree-level-order-traversal/
// O(n) time complexity, where n is number of nodes in binary tree

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> final_list = new ArrayList<>();
        
        // base case
        if(root == null)
            return final_list;
        
        // Create a queue of TreeNode type
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        
        while(que.size()!=0)
        {
            // store the elements level wise
            List<Integer> list1 = new ArrayList<>();
            int len = que.size();
            
            for(int i=0; i<len; i++)
            {
                TreeNode current = que.poll();
                //Traverse through left and right
                if(current.left!=null)
                    que.add(current.left);
                if(current.right!=null)
                    que.add(current.right);
                    
                list1.add(current.val);
            }
            
            // add this list to final list
            final_list.add(list1);
            // the move to next level
        }
        return final_list;
    }
}

// Binary Tree : Level Order Traversal
// https://leetcode.com/problems/binary-tree-level-order-traversal/
// O(n) time complexity, where n is number of nodes in binary tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
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
            
            final_list.add(list1);
        }
        return final_list;
    }
}

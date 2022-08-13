// Tree : Kth smallest element in a BST
// Leetcode : https://leetcode.com/problems/kth-smallest-element-in-a-bst/
// Inorder traversal approach - O(n)

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
    ArrayList<Integer> list1 = new ArrayList<>();
    
    public void inorder(TreeNode root)
    {   if(root == null)
          return;
        
        if(root!=null) {
            inorder(root.left);
            list1.add(root.val);
            inorder(root.right);
        }
    }
    
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        
        return list1.get(k-1);
    }
}

// Tree : Invert the binary tree
// Leetcode : https://leetcode.com/problems/invert-binary-tree/
// Recursion way

class Solution {
    public TreeNode invertTree(TreeNode root) {
        // recursive way
        if(root == null)
            return root;
        
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        
        return root;
    }
}

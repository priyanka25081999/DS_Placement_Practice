// Tree : Insert an element into binary search tree
// https://leetcode.com/problems/insert-into-a-binary-search-tree/

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        // Base case
        // if root is null, insert the new element as root and return
        if(root == null)
            return new TreeNode(val);
        
        // if value lesser than root, then traverse through left subtree and insert
        // else traverse through right subtree and insert
        // finally return the root
        if(val < root.val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right = insertIntoBST(root.right, val);
        
        return root;
    }
}

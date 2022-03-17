// Tree : Search an element in binary search tree
// https://leetcode.com/problems/search-in-a-binary-search-tree/

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
        // Base case
        if(root==null)
            return null;
        
        // return root, if value matches with target value
        if(root.val == val)
            return root;
        
        // if value is lesser than root, search in left subtree
        // else search in right subtree
        if(val < root.val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }
}

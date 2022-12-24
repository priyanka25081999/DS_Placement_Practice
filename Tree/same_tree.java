// Tree : Given the roots of two binary trees p and q, write a function to check if they are the same or not.
// Leetcode : https://leetcode.com/problems/same-tree/description/
// Approach : Recursive approach
// Time complexity : O(h), where h is the height of the binary tree
// Space complexity : O(N), Space is needed for the recursion stack. In the worst case (skewed tree), space complexity can be O(N).

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // base case
        if(p==null && q==null)
            return true;
        
        if(p==null || q==null || p.val!=q.val)
            return false;
        
        // otherwise, recurse over left subtree and right subtree
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

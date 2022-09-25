// Tree : Validate Binary Search Tree
// Leetcode : https://leetcode.com/problems/validate-binary-search-tree/
// Time complexity : O(N)

class Solution {
    public boolean checkBST(TreeNode root, long min, long max)
    {
        //base case
        if(root==null)
            return true;
        
        // out of the range
        // [min, max]
        if(root.val<=min || root.val>=max)
            return false;
        
        // left -> [min, root.val]  and  right -> [root.val, max]
        if(checkBST(root.left, min, root.val) && checkBST(root.right, root.val, max))
            return true;
        else
            return false;
        
    }
    
    public boolean isValidBST(TreeNode root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}

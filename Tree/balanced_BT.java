// Tree : Given a binary tree, determine if it is height-balanced
// A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
// Approach : Recursive solution
// Time complexity : O(N)
// Space complexity : O(1) Extra Space + O(H) Recursion Stack space (Where “H”  is the height of binary tree) - auxiliary

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        
        int ht = helper(root);

        if(ht != -1)
            return true;
        return false;
    }

    public int helper(TreeNode root) {
        // we get 0/1/-1 or greater
        if(root == null)
            return 0;

        int left_ht = helper(root.left);
        if(left_ht == -1)
            return -1;
        int right_ht = helper(root.right);
        if(right_ht == -1)
            return -1;

        if(Math.abs(left_ht - right_ht) > 1)
            return -1;
        return Math.max(left_ht, right_ht)+1;

    }
}

// Tree : Convert BST to Greater tree
// Recursive solution
// Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that 
// every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.
// https://leetcode.com/problems/convert-bst-to-greater-tree/

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
    int sum=0;
    public TreeNode convertBST(TreeNode root) { 
        // base condition
        if(root == null)
            return null;
        
        // Go till end of right subtree to get the max/greatest value of tree
        convertBST(root.right);
        
        // Start performing sum and increase the node value by accomodated sum
        int temp = root.val;
        root.val = root.val + sum;
        
        // increase the sum
        sum = sum + temp;
        
        // go to the left subtree
        convertBST(root.left);
        
        return root;
    }
}

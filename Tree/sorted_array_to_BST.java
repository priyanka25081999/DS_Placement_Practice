// Tree : Convert Sorted array to Binary Search Tree (BST)
// Recursive solution
// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

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
    public TreeNode sortedArrayToBST(int[] nums) {
        // find the length of an array
        int len = nums.length;
        
        // base case
        if(len == 0)
            return null;
        
        // If an array has one element then return the one tree node 
        if(len == 1)
            return new TreeNode(nums[0]);
        
        // divide the array from middle
        TreeNode root = new TreeNode(nums[len/2]);
        
        // left subtree
        int arr1[] = Arrays.copyOfRange(nums, 0, len/2);
        root.left = sortedArrayToBST(arr1);
        
        // right subtree
        int arr2[] = Arrays.copyOfRange(nums, len/2 + 1, len);
        root.right = sortedArrayToBST(arr2);
        
        // return the root
        return root;
    }
}

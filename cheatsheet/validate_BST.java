// Tree : Validate binary search tree
// Leetcode : https://leetcode.com/problems/validate-binary-search-tree/
// Inorder traversal approach - compare prev elements, if greater then no BST

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
    List<Integer> list1 = new ArrayList<>();
    
    public void inorder(TreeNode root) {
      // Inorder tree traversal  
      if(root!=null) {
            inorder(root.left);
            list1.add(root.val);
            inorder(root.right);
        }
    }
    
    public boolean isValidBST(TreeNode root) {
      // base case  
      if(root == null)
            return true;
        
        inorder(root);
        
        // convert arraylist into array
        int ans[] = new int[list1.size()];
        for(int i=0; i<list1.size(); i++)
            ans[i] = list1.get(i);
        
        for (int i=0; i<ans.length; i++)
        {
            for(int j=i+1; j<ans.length; j++)
            {
                // if prev element is greater or equal to current
                // then return false
                if(ans[i] >= ans[j])
                    return false;
            }
        }
        
        return true;
    }
}

// Approach 2 - Inorder traversal optimized way
// Time complexity - O(n)

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
    boolean flag = true;
    TreeNode prev = null;
    
    public void inorder(TreeNode root)
    {
        // base case
        if(root == null)
            return;
        
        inorder(root.left);
        if(prev!=null && prev.val >= root.val)
        {
            flag = false;
            return;
        }
        
        prev = root;
        inorder(root.right);
    }
    
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return flag;
    }
}


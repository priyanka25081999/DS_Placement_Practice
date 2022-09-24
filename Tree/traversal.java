// Tree : Preorder Traversal
// Time complexity : O(N)
// https://leetcode.com/problems/binary-tree-preorder-traversal/

class Solution {
    
    public void preorder(TreeNode root, List<Integer> preorder_list)
    {
        // check the base case
        if(root == null)
            return;
        
         // Traverse : root -> left_subtree -> right_subtree
         preorder_list.add(root.val);
         preorder(root.left, preorder_list);
         preorder(root.right, preorder_list);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        // create an output list
        List<Integer> preorder_list = new ArrayList<>();
        preorder(root, preorder_list);
        return preorder_list;
    }
}

/* ------------------------------------------------------------------
// Tree : Inorder Traversal
// https://leetcode.com/problems/binary-tree-inorder-traversal/

class Solution {
    
    public void inorder(TreeNode root, List<Integer> inorder_list)
    {
        // check the base case
        if(root == null)
            return;
        
        // Traverse : left_subtree -> root -> right_subtree
        inorder(root.left, inorder_list);
        inorder_list.add(root.val);
        inorder(root.right, inorder_list);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder_list = new ArrayList<>();
        inorder(root, inorder_list);
        return inorder_list;
    }
}
*/

/* ------------------------------------------------------------------
// Tree : Postorder Traversal
// https://leetcode.com/problems/binary-tree-postorder-traversal/

class Solution {
    
    public void postorder(TreeNode root, List<Integer> postorder_list)
    {
        // check the base case
        if(root == null)
            return;
        
        postorder(root.left, postorder_list);
        postorder(root.right, postorder_list);
        postorder_list.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder_list = new ArrayList<>();
        postorder(root, postorder_list);
        return postorder_list;
    }
}
*/

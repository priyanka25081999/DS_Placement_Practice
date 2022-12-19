// Tree : Top view of the Binary Tree
// GFG : https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
// Approach : Silghtly different version of vertical order traversal
// Here, we need to do vertical order traversal and pick the first node only. That is draw the lines vertically, where root line is always mark as 0, 
// left is -1 and right is +1 and so on. Another difference than the bottom view of BT is that, here we don't need to update the treemap if the entry is already exists // as we always want to get top elements i.e elements which are visible from top of the tree.
// Time complexity : O(N)
// Space complexity : O(N), as we are using an extra DS for storing

class Solution
{
    // creating our own static class, as hd is not defined in the Node (default) class.
    static class Pair {
        int hd;
        Node node;
        
        public Pair(int hd, Node node) {
            this.node = node;
            this.hd = hd;
        }
    }

    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
            
        Queue<Pair> queue = new ArrayDeque<>();
        Map<Integer, Integer> tmap = new TreeMap<>();
        
        queue.add(new Pair(0, root));
        
        while(!queue.isEmpty()) 
        {
            Pair current_node = queue.poll();
            
            // This time as we want the top view, so don't replace the value if key already exists in the map
            if(!tmap.containsKey(current_node.hd))
                tmap.put(current_node.hd, current_node.node.data);
                
            if(current_node.node.left!=null) {
                queue.add(new Pair(current_node.hd-1, current_node.node.left));
            }
            
            if(current_node.node.right!=null) {
                queue.add(new Pair(current_node.hd+1, current_node.node.right));
            }
        }

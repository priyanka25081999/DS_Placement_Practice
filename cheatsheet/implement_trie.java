// Trie : Implement trie (Prefix tree)
// Leetcode : https://leetcode.com/problems/implement-trie-prefix-tree/
// Time complexity : O(M) for searching
// HashMap approach

class Trie {
    
    Node root;
    // create a class
    class Node
    {
        // 2 members
        HashMap<Character, Node> child = new HashMap<>(); // hashmap of char - to store name and node - to point to next entry
        boolean isEndOfWord = false; // to keep track of last entry
    }

    public Trie() {
        // initialize the root node in the constructor
        root = new Node();
    }
    
    public void insert(String word) {
        Node curr = root;
        // divide the word into characters and then put them
        for(char ch : word.toCharArray())
        {
            // if the char is not present in the hashmap, then add it by creating new node
            if(!curr.child.containsKey(ch))
                curr.child.put(ch, new Node());
            
            // if the char presents, then simply get the pointer of that node
            curr = curr.child.get(ch);
        }
        
        // make the node as last entry
        curr.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        // gives true if word is present, else false
        Node temp = getLastEntry(word);
        
        // check, if the temp is not null and if it is the last entry/word in the tree
        // then return true, else the whole word doesn't exists so return false
        if (temp != null && temp.isEndOfWord)
            return true;
        
        return false;
        
        // or we can simply return it like -> return (temp!=null && isEndOfWord) 
    }
    
    public boolean startsWith(String prefix) {
        // gives true if prefix is present, else false
        Node temp = getLastEntry(prefix);
        
        // here, we need to check, if the temp is null that means entry does exists in tries
        if (temp == null)
            return false;
        
        return true;
    }
    
    // add a new common utility function to get the entry from trie
    public Node getLastEntry(String word)
    {
        Node curr = root;
        
        for(char ch : word.toCharArray())
        {
            // if the entry doesn't exists then return null
            if(!curr.child.containsKey(ch))
                return null;
            
            // else, get the entry and return it
            curr = curr.child.get(ch);
        }
        
        return curr;
    }
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

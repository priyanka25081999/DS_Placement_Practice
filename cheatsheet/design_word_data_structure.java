// Word Data structure : https://leetcode.com/problems/design-add-and-search-words-data-structure/
// Approach : Tries and Hashmap

class Node {
    HashMap<Character, Node> child = new HashMap<>();
    boolean isEndOfWord = false;
}

class WordDictionary {

    // create an instance
    private Node root;
    
    public WordDictionary() {
        this.root = new Node();
    }
    
    public void addWord(String word) {
        Node curr = this.root;
        for(char ch : word.toCharArray())
        {
            if(!curr.child.containsKey(ch))
                curr.child.put(ch, new Node());
            
            curr = curr.child.get(ch);
        }
        
        curr.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        return search_word(word, 0, this.root);
    }
    
    public boolean search_word(String word, int start_index, Node node)
    {
        // here, we need 2 conditions
        // one is to check whether word contains '.' (dot)
        // second to check normal words
        
        Node curr = node;
        for(int i=start_index; i<word.length(); i++)
        {
            if(word.charAt(i) == '.')
            {
                for(Node ch : curr.child.values()) {
                    if (search_word(word, i+1, ch)) return true;
                }
                
                return false;
            }
            else
            {
                if(!curr.child.containsKey(word.charAt(i)))
                        return false;
                    
                curr = curr.child.get(word.charAt(i));
            }
        }
        
        return curr.isEndOfWord;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

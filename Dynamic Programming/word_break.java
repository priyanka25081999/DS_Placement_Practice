// DP : Word Break
// Leetcode : https://leetcode.com/problems/word-break/
// Approach : Memorization (DP) + HashMap + Trie data structure (Trie reference - https://github.com/priyanka25081999/DS_Placement_Practice/blob/ca3e31b5bdff73efe6cde6b51e3a97c615c61c54/cheatsheet/implement_trie.java)
// Time complexity : O(M) for searching in Trie
// The complexity of creating a trie is O(W*L) , where W is the number of words
// And L is an average length of the word: you need to perform L lookups on the average for each of the W words in the set.

class Trie
{
    Node root;
    
    public Trie()
    {
        root = new Node();
    }
    
    class Node
    {
        HashMap<Character, Node> hmap;
        boolean isEndOfWord;
        
        Node()
        {
            hmap=new HashMap<Character, Node>();
            isEndOfWord=false;
        }
    }
    
    public void insert(String word)
    {
        Node curr = root;
        
        for(char ch : word.toCharArray())
        {
            if(!curr.hmap.containsKey(ch))
                curr.hmap.put(ch, new Node());
            
            curr = curr.hmap.get(ch);
        }
        
        curr.isEndOfWord=true;
    }
}


class Solution extends Trie{
    
    public boolean helper(String s, int start, Trie trie_obj, int dp[])
    {
        // dp[i] stores 1 if string s starting from index i follows the question constraints
        if(dp[start] != -1)
            return (dp[start] == 1) ? true : false;
        
        // get the root of trie
        Node curr = trie_obj.root; 
        
        for(int i=start; i<s.length(); i++)
        {
            if(!curr.hmap.containsKey(s.charAt(i)))
            {
                dp[start] = 0;
                return false;
            }  
            
            if(curr.hmap.get(s.charAt(i)).isEndOfWord)
            {
               // split the string from this point and recursively check for the remaining string.
                // note that the start argument is i+1 here, i.e, we will only check the remaining string starting from index i+1.
                if(helper(s, i+1, trie_obj, dp))
                {
                    dp[start]=1;
                    return true;
                }
            }
            
            // move to the next trieNode from this point to check for next character.
            curr = curr.hmap.get(s.charAt(i));
        }
        
        // if you reached end of string without finding a suitable match simply return false.
        dp[start]=0;
        return false;
    }
    
    public boolean wordBreak(String s, List<String> wordDict) {
        // insert wordDict into trie
        Trie trie_obj = new Trie();
        
        for(String word : wordDict)
            trie_obj.insert(word);
        
        // memo table
        int dp[] = new int[s.length()+1];
        Arrays.fill(dp, -1);
        
        dp[s.length()] = 1;
        
        //char ch[] = s.toCharArray();
        return helper(s, 0, trie_obj, dp);
    }
}

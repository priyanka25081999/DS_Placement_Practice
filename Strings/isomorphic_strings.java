// String : Isomorphic Strings - Given two strings s and t, determine if they are isomorphic.
// Leetcode : https://leetcode.com/problems/isomorphic-strings/
// Approach-1 : HashMap
// Time complexity : O(N)
// Space complexity : O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
    
        HashMap<Character, Character> hmap1 = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            // if the key exists then check if it's value is tChar or not
            if(hmap1.containsKey(sChar)) {
                // if sChar doesn't pair with tChar then return false
                if(hmap1.get(sChar) != tChar)
                    return false;
            }
            // if tChar mapped with some other sChar char then also return false
            else if(hmap1.containsValue(tChar))
                return false;
            // if the entry doesn't exists then add a mapping of sChar and tChar into the hashmap
            else
                hmap1.put(sChar, tChar);
        }
        
        return true;
    }
}

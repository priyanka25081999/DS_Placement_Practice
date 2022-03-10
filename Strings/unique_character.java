// String : Find unique character
// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
// https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        // Do all mapping
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        
        // get the unique character
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(hm.get(ch) == 1)
                return i;
        }
        return -1;
    }
}

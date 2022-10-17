// String : Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        
        // convert string into char arrays
        char temp1[] = s.toCharArray();
        char temp2[] = t.toCharArray();
        
        // sort the arrays
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        
        // convert arrays into string
        s = new String(temp1);
        t = new String(temp2);
        
        // if both strings are equal, return true else false
        if(s.equals(t))
            return true;
        else
            return false;
    }
}

// Approach-2, using one hashmap
class Solution {
    public boolean isAnagram(String s, String t) {
        // base case
        if(s.length()!=t.length())
            return false;
        
        HashMap<Character, Integer> hmap1 = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
            hmap1.put(s.charAt(i), hmap1.getOrDefault(s.charAt(i),0)+1);
        
        for(int i=0; i<t.length(); i++)
        {
            if(hmap1.get(t.charAt(i))==null || hmap1.get(t.charAt(i))==0)
                return false;
            
            hmap1.put(t.charAt(i), hmap1.getOrDefault(t.charAt(i),0)-1);
        }
        
        for(char ch : hmap1.keySet())
        {
            if(hmap1.get(ch) > 0)
                return false;
        }
        return true;
    }
}

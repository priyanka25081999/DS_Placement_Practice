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

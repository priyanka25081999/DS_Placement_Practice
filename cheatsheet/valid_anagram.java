// String : Valid Anagram
// Leetcode : https://leetcode.com/problems/valid-anagram/
// Approach 1 : HashMap

class Solution {
    public boolean isAnagram(String s, String t) {
        // Return false if string lengths are different
        if(s.length() != t.length())
            return false;
                
        // Create a hashmap and add a frequency
        HashMap<Character, Integer> hmap1 = new HashMap<>();
        
        for(char ch : s.toCharArray())
            hmap1.put(ch, hmap1.getOrDefault(ch, 0)+1);
        
        for(char ch : t.toCharArray())
        {
            // no char found in string t.
            if(hmap1.get(ch)==null || hmap1.get(ch)==0)
                return false;
            else // decrease the count of char by 1
                hmap1.put(ch, hmap1.getOrDefault(ch, 0)-1);
        }
        
        for(char ch : hmap1.keySet())
        {
            // if character count is greater than 0
            // that means it is exists then return false
            if(hmap1.get(ch) > 0)
                return false;
        }
        
        return true;
    }
}

// Approach 2 - Sorting method
/*

class Solution {
    public boolean isAnagram(String s, String t) {
        
        char S[] = s.toCharArray();
        char T[] = t.toCharArray();
        
        // Sort the character arrays
        Arrays.sort(S);
        Arrays.sort(T);
        
        // Return true if arrays are equal, else false
        return Arrays.equals(S, T);
    }
}

*/

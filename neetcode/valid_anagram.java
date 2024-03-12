// Problem: https://leetcode.com/problems/valid-anagram/
// Single HashMap approach
// Overall, the time complexity is O(n), where n is the maximum length between strings s and t
// The space complexity of the algorithm is O(n), where n represents the size of the HashMap

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> hmap = new HashMap<>();
       
       for (int i=0; i<s.length(); i++) {
        hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0)+1);
       }

       for (int i=0; i<t.length(); i++) {

        if (hmap.get(t.charAt(i))==null || hmap.get(t.charAt(i))==0)
            return false;
        else
            hmap.put(t.charAt(i), hmap.getOrDefault(t.charAt(i), 0)-1);
       }

       for (int i=0; i<s.length(); i++) {
            if(hmap.get(s.charAt(i)) > 0)
                return false;
       }

       return true;
    }
}

// Another approach is sort both arrays and then do arrays.equals
// Time Complexity: O(n log n), where n is the length of the longer of the two strings.
// Space Complexity: O(n + m), where n is the length of string s and m is the length of string t

class Solution {
    public boolean isAnagram(String s, String t) {
       char sChar[] = s.toCharArray();
       char tChar[] = t.toCharArray();

       Arrays.sort(sChar);
       Arrays.sort(tChar);

       return Arrays.equals(sChar, tChar);
    }
}

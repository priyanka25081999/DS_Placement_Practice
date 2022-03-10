// String : Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
// https://leetcode.com/problems/ransom-note/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // convert into character arrays
        char temp1[] = ransomNote.toCharArray();
        char temp2[] = magazine.toCharArray();
        
        // Sort the arrays
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        
        // convert to string 
        ransomNote = new String(temp1);
        magazine = new String(temp2);
        
        int j=0;
        for(int i=0; i<magazine.length(); i++)
        {
            // if both characters of string matches
            // and if first pointer reaches till end
            // then return true, else false.
            if(ransomNote.charAt(j) == magazine.charAt(i))
            {    j++;
                 if(j==ransomNote.length())
                     return true;
            }   
        }
        return false;
    }
}

// String : Pangram String
// A pangram is a sentence where every letter of the English alphabet appears at least once.
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
// HashSet approach

class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hset = new HashSet<>();
        
        for(int i=0; i<sentence.length(); i++)
        {
            hset.add(sentence.charAt(i));
        }
        
        if(hset.size()!=26)
            return false;
        else
            return true;
    }
}

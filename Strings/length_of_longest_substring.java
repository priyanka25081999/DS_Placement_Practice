// String : Longest Substring Without Repeating Characters
// Leetcode : https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Time complexity : O( 2*N ) (sometimes left and right both have to travel complete array)
// Space Complexity: O(N) where N is the size of HashSet taken for storing the elements

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        
        int max_length = Integer.MIN_VALUE;
        HashSet<Character> hset = new HashSet<>();
        int left=0;
        
        for(int right=0; right<s.length(); right++)
        {
            while(left<right && hset.contains(s.charAt(right)))
            {
                hset.remove(s.charAt(left));
                left++;
            }
            // add the character into set
            hset.add(s.charAt(right));
            
            max_length = Math.max(max_length, right-left+1);
        }
        
        return max_length;
    }
}


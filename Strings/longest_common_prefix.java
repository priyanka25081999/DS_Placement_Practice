// String : Longest Common Prefix
// Leetcode : https://leetcode.com/problems/longest-common-prefix/
// Approach-1 : substring, simple approach
// Time complexity : O(N)
// Space complexity : O(1)

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Return empty string if length is zero(0)
        if(strs.length == 0)
            return "";
        
        // create another string
        String prefix = strs[0]; 
        
        // start from the second string 
        // remove the prefix by one until we get the common prefix
        for(int i=1; i<strs.length; i++)
        {
            // decreament the prefix by 1
            while(strs[i].indexOf(prefix)!=0)
                prefix = prefix.substring(0, prefix.length()-1);
        }
        
        return prefix;
    }
}

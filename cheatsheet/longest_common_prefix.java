// String : Longest common prefix
// Leetcode : https://leetcode.com/problems/longest-common-prefix/

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

// Explaination:
// 1st iteration
// prefix = s[0], that is prefix = flower
// i=1, s[i] = flow
// s[i].indexOf(prefix)!=0 that is flow.indexOf(flower)!=0 -> true
// decreament the prefix (flower) by 1. So new prefix = flowe
// s[i].indexOf(prefix)!=0 that is flow.indexOf(flowe)!=0 -> true
// decreament the prefix (flower) by 1. So new prefix = flow
// s[i].indexOf(prefix)!=0 that is flow.indexOf(flow)!=0 -> false
// Now it increaments the i by 1
// process continues until we get the longest common prefix

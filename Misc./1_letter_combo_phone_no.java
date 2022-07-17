// String : Letter Combinations of a Phone Number
// Leetcode : https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// BFS approach
// Time complexity : O(3^M*4^N)
// Space complexity : O(3^M*4^N)

// Procedure:
// At the beginning, it is an empty string.
// The new layer is obtained by adding characters at the end of the previous layer;
// After the new layer is obtained, the previous layer is not used;

class Solution {
    public List<String> letterCombinations(String digits) {
               
        List<String> res_list = new ArrayList<>();
        
        if(digits.length()==0 || digits==null)
            return res_list;
        
        // store respective characters
        String[] str_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        res_list.add("");
        
        for(int i=0; i<digits.length(); i++)
        {
            String letter = str_map[digits.charAt(i) - '2']; // abc
            List<String> temp_list = new ArrayList<>();
            
            for(String s1 : res_list)
            {  
                for(char s2 : letter.toCharArray()) // "d", "e", "f"
                {
                    temp_list.add(s1 + s2);
                }
            }
            
            res_list = temp_list;
        }
        
        return res_list;
    }
}

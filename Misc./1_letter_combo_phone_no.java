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

// Another approach : Recursion
/*
class Solution {
    public List<String> letterCombinations(String digits) {
        String digits = "23";
	    List<String> result = new ArrayList<>();
        if(digits == null || digits.isEmpty())
            System.out.println("res : "+ result);
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        
        helper(digits, map, 0, result, "");
        return result;
    }
    public static void helper(String digits, Map<Character,String> map,int index, List<String> result, String str) {
        if(str.length() == digits.length()) {
            result.add(str);
            return;
        }

        String chars = map.get(digits.charAt(index));
        for(int i=0; i<chars.length(); i++) {
            helper(digits, map, index+1, result, str+chars.charAt(i));
        }
    }
}

*/


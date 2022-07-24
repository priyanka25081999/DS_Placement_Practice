// String : Group Anagrams
// Leetcode : https://leetcode.com/problems/group-anagrams/ 
// Time complexity : O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group_anagrams = new ArrayList<>();
        HashMap<String, List<String>> hmap = new HashMap<>();
        
        // get the each strings from strs array
        for(String word : strs)
        {
            // convert the word (e.g. eat) into character array
            char ch[] = word.toCharArray();
            
            // now sort the array
            Arrays.sort(ch);
            
            // again convert sorted word into the string
            String key = new String(ch);
            
            // check if the word present in the hashmap
            // if yes, then append this new word into the hashmap, else add this new word
            // here, key means sorted word and value means the actual word from string
            // for example: key - aet, value - [eat, tea, ate]
            if(!hmap.containsKey(key))
            {
                List<String> newlist = new ArrayList<>();
                newlist.add(word);
                hmap.put(key, newlist);
            }
            else
            {
                hmap.get(key).add(word);
            }
        }
        
        // add the sublists from hmap values into final list
        for(List<String> ls : hmap.values())
            group_anagrams.add(ls);
        
        return group_anagrams;
    }
}

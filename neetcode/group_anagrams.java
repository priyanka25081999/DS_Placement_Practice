// Problem: https://leetcode.com/problems/group-anagrams/description/
// take a single word from strs, sort it (nlogn) 
// check if the word present in the hashmap
// if yes, then append this new word into the hashmap, else add this new word
// here, key means sorted word and value means the actual word from string
// for example: key - aet, value - [eat, tea, ate]
// finally, add the sublists from hmap values into final list
// Time complexity: Overall, the time complexity is O(k * n * log(n)), where k is the number of strings in strs and n is the length of the longest string in strs.
// Space complexity: Overall, the space complexity is O(k * n), where k is the number of strings in strs and n is the length of the longest string in strs.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> hmap = new HashMap<>();

        for(String word: strs) {
            // sort the word
            char ch[] = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if(!hmap.containsKey(key)) {
                // add the key
                List<String> valueList = new ArrayList<>();
                valueList.add(word);
                hmap.put(key, valueList);
            } else {
                hmap.get(key).add(word);
            }
        }

        for (List<String> list : hmap.values()) {
            res.add(list);
        }

        return res;
    }
}

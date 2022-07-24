// Longest Repeating Character Replacement
// HashMap and Sliding window - O(n)

class Solution {
    public int characterReplacement(String s, int k) {
        int max_freq = 0, max_window = 0, left = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();
        
        for(int right = 0; right < s.length(); right++)
        {
            char ch = s.charAt(right);
            if(!hmap.containsKey(ch))
                hmap.put(ch, 0);
            
            // increase the char freq if it's already present in the map
            hmap.put(ch, hmap.get(ch)+1);
            
            // get the max freq of the char from map
            max_freq = Math.max(max_freq, hmap.get(ch));
            
            // check if the window is valid, if yes then get the replacement count
            //int current_window = right - left + 1;
            
            if(right-left+1 - max_freq > k)
            {
                // decrease the previous char count from the map, as we are skipping it
                char remove_ch = s.charAt(left);
                hmap.put(remove_ch, hmap.get(remove_ch)-1);
                left++; // shift the window, skip the previous letter
            }
            
            // update the final window size
            max_window = Math.max(max_window, right-left+1);
        }
        
        return max_window;
    }
}

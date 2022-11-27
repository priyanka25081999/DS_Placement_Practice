// String : Sort characters by frequency
// Leetcode : https://leetcode.com/problems/sort-characters-by-frequency/
// Approach-1 : HashMap and Priority Queue(MaxHeap)
// Time complexity : O(nLogk) - where, O(N) of building hashmap and O(logK) of building the priority queue. O(N)+O(LogK) = O(nLogk). Final time complexity is O(nLogk)
// Space complexity : O(2N) = O(N). So the final space complexity is O(N)

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
            hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0)+1);
        
        // MaxHeap creation : create a priority queue with decreasing order
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->(hmap.get(b) - hmap.get(a)));
        pq.addAll(hmap.keySet());
        
        StringBuilder sb = new StringBuilder();
        
        while(!pq.isEmpty()) {
            char ch = pq.poll();
            
            // append the same char to result string till frequency count
            // i.e tree, here e appears twice, hence append it twice
            // hmap.get(c) -> gives the frequency of the char
            for(int i=0; i<hmap.get(ch); i++)
                sb.append(ch); //append the same char
        }
        
        // convert sb into string and then return
        return sb.toString();
    }
}

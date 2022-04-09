// Array : Find Top K frequent elements
// HashMap and MaxHeap approach
// https://leetcode.com/problems/top-k-frequent-elements/


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Declaration of hashmap
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        // Sort the array
        Arrays.sort(nums); // [1,1,1,2,2,3]
        
        // Put the elements into hashmap
        for(int i=0; i<nums.length; i++)
        {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
        }
        
        // Let's create the maxheap
        PriorityQueue<Integer> max_heap = new PriorityQueue<>((a,b) -> hmap.get(b) - hmap.get(a));
        
        // add only keys to heap
        for(int key : hmap.keySet())
            max_heap.add(key);
        
        // Prepare the resutlt array and add max k elements in array
        int res[] = new int[k];
        for(int i=0; i<k; i++)
            res[i] = max_heap.poll();
        
        // return the array
        return res;
    }
}

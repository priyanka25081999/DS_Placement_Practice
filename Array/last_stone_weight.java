// Array : Last stone weight
// https://leetcode.com/problems/last-stone-weight/
// Normal approach
/* Example:

[2,7,4,1,8,1]

Let's sort it:

[1,1,2,4,7,8]
Now let's collide the 2 stones and get their difference i.e. y - x

[1,1,2,4,7,8]  -->  y = 8      &      x = 7

Thus,
y - x    -->  8 - 7 = 1

Now we are going to put that one in our array & maintain the order by sorting it back again

[1,1,2,4]          add => 1   in our array

[1,1,2,4,1]          now again sort it,

[1,1,1,2,4]

And now, we perform the same step for all. This is not the best option and it also increases time complexity

ANALYSIS :-
Time Complexity :- BigO(NlogN) * BigO(NlogN) => BigO(N^2logN)
Space Complexity :- BigO(1)
*/

class Solution {
    public int lastStoneWeight(int[] stones) {
        // Normal approach
        // Sort the array
        Arrays.sort(stones);
        
        // start the loop from end of an array
        for (int i=stones.length-1; i>0; i--)
        {
            // new weight of y is y-x
            stones[i-1] = stones[i] - stones[i-1];
            // again re-sort the array as we added new weight
            Arrays.sort(stones);
        }
        
        // return 1st element of an array
        return stones[0];
    }
}

/*

Let's optimize
As, we want highest value at the first & lowest value in the last. So, we gonna use maxHeap
Let's create our maxHeap and use the same example i.e. [2,7,4,1,8,1] to fill our heap.
Now, let's fill our heap.

                Array           [2,7,4,1,8,1]
|     |
|     |		
|     |  
|     |
|     |
|     |
--------
maxHeap
Now let's fill our heap,

                Array           [2,7,4,1,8,1]
				                 
|     |
|     |		
|     |  
|     |
|     |
|  2  |
--------
maxHeap
                Array           [2,7,4,1,8,1]
				                   
|     |
|     |		
|     |  
|     |
|  7  |
|  2  |
--------
maxHeap
                Array           [2,7,4,1,8,1]
				                     
|     |
|     |		
|     |  
|  7  |
|  4  |
|  2  |
--------
maxHeap
                Array           [2,7,4,1,8,1]
				                       
|     |
|     |		
|  7  |  
|  4  |
|  2  |
|  1  |
--------
maxHeap
                Array           [2,7,4,1,8,1]
				                         
|     |
|  8  |		
|  7  |  
|  4  |
|  2  |
|  1  |
--------
maxHeap
                Array           [2,7,4,1,8,1]
				                           
|  8  |
|  7  |		
|  4  |  
|  2  |
|  1  |
|  1  |
--------
maxHeap
Now it's time to get the stone x & y using our heap & after calculating y - x put the new difference in heap

                Array           [2,7,4,1,8,1]
				                           
|     |         y = 8
|     |		      x = 7
|  4  |      
|  2  |         and their result will be y - x => 8 - 7 = 1
|  1  |
|  1  |
--------
maxHeap
Now put that 1 into our heap & again calculate the result of stone x & y

                Array           [2,7,4,1,8,1]
				                           
|     |         y = 4
|     |		      x = 2
|     |      
|  1  |         and their result will be y - x => 4 - 2 = 2
|  1  |
|  1  |
--------
maxHeap
So, the loop ends when we only have 1 element left in our heap

class Solution {
    public int lastStoneWeight(int[] stones) {
        // Priority Queue - MaxHeap
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
       
        // Let's fill the heap first
        for (int i : stones)
            max_heap.offer(i);
        
        // Start the loop until & unless only 1 element left in our heap
        int x,y;
        while(max_heap.size() > 1)
        {
            // Get top 2 elements
            y = max_heap.poll();
            x = max_heap.poll();
            
            // Put new weight in the heap
            if(y>x)
                max_heap.offer(y-x);
        }
        
        if(max_heap.size() == 0)
            return 0;
        
        // return the remaining(one) element
        return max_heap.poll();
        
    }
}

*/

MO's algorithm - 

* Let's say we came across the **query based question** as finding the sum of given range index l to r in an array. 
We are given Q queries. So, for each query we have to traverse the whole array from l to r and output the sum which is very inefficient in terms of time complexity. 
Time complexity for this naive approach will be **O(Q*N)** where N is the size of array and Q is the number of queries.

* Let us consider a better approach where we divide the array into some blocks of same size and then calculate the sum of the elements of the blocks. 
By this way we **preprocessed the sum** beforehand. This will improve the time complexity of our solution greatly as for each query we arn't needed to move 
from l to r by traversing each element of the array. We simply add the ith block(whose sum is precalculated) which is fully inside the range [l,r]. 

* This approach is known as **Square root decomposition** as the name suggest we divide the array into **small blocks of length sqrt(N)** and for each block **i** we'll 
precalculate some answers(like sum of subarray or min or max element) in **O(sqrt(N))** operations, which is much faster than O(N) for the trivial algorithm.

* This algorithm is the pre-requisite to MO's algorithm which efficiently answer offline queries in less time. 
Here offline queries are the queries which are known beforehand and no update operations are performed on the given array.
The idea is to answer the queries in a special order based on the indices so that we answer the current query by modifying the result of the previously answered query.

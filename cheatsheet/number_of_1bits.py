# Binary : Number of 1 bits
# Leetcode : https://leetcode.com/problems/number-of-1-bits/
# uses right shift simple approach

class Solution:
    def hammingWeight(self, n: int) -> int:
        res = 0
        
        while(n):
            res += n%2
            n = n>>1
            
        return res

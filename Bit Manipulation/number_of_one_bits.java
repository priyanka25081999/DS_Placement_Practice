// Bit Manipulation : Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
// Brian Kernighan's Algorithm
// https://leetcode.com/problems/number-of-1-bits/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        // Brian Kernighan’s Algorithm
        // This algorithm states that, If we do n & (n-1) in a loop and count the number of
        // times the loop executes, we get the set bit count.
        
        int cnt=0;
        while(n!=0)
        {
            cnt++;
            n = n&(n-1);
        }
        return cnt;
    }
}

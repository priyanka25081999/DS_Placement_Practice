// Binary : Reverse bits
// Leetcode : https://leetcode.com/problems/reverse-bits/
// Time complexity : Constant

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        
        for(int i=0; i<32; i++)
        {
            // get the starting bit from the number
            int bit = (n>>i) & 1;
            // put in the res number in reverse order
            res = res | (bit << (31-i));
        }
        
        return res;
    }
}

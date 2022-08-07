// Binary : Sum of two integers 
// Given two integers a and b, return the sum of the two integers without using the operators + and -.
// Leetcode : https://leetcode.com/problems/sum-of-two-integers/
// Bit Manipulation

class Solution {
    public int getSum(int a, int b) {
        // base condition
        if(b == 0)
            return a;
        
        while(b!=0)
        {
            // find the bitwise addition of a and b
            // carry contains the common set bits of "a" and "b"
            int carry = a & b;
            
            // find the bitwise xor (if corresponding bits are different, it gives 1, else it shows 0) of both numbers
            a = a ^ b;
            
            // carry is shifted by one so that adding it to "a" gives the required sum
            b = carry << 1;
        }
        
        return a;
    }
}

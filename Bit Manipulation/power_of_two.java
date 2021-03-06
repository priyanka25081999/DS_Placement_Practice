// Bit Manipulation : Power of Two
// Leetcode : https://leetcode.com/problems/power-of-two/
// Recursive approach

class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n==1)
            return true;
        
        return n>0 && (n%2==0 && isPowerOfTwo(n/2));
    }
}

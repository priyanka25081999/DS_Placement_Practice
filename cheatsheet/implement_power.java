// Math : Pow(x, n)
// Leetcode : https://leetcode.com/problems/powx-n/
// Getting TLE

class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        
            
        for(int i=0; i<Math.abs(n); i++)
        {
            res = res*x;
        }
        
        if(n<0)
            res = 1/res;
        
        return res;
    }
}

// Working.....

// Bit Manipulation : Sum of two integers (without using + operator)
// Time complexity : O(1)
// Space complexity : O(1)

class Solution {
    public int getSum(int a, int b) {
        while(b!=0)
        {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        
        return a;
    }
}

/*
we cannot use add operator to sum, so we use XOR and & bitwise operator
  b = 0010 & 0011 = 0010 then 0010 shift by 1 = 0100
  a = 0010 ^ 0011 = 0001
Now b(4) != 0 is True, so we will do it again
  b = 0001 & 0100 = 0000 then 0000 shift by 1 = 0000
  a = 0001 ^ 0100 = 0101
Now b(0) != 0 is False, so we will stop and return a
*/

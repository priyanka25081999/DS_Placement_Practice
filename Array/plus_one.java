// Array : Plus one - Increment the large integer by one and return the resulting array of digits.
// https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        //start the loop from end of an array
        for (int i=digits.length-1; i>=0; i--)
        {
            if(digits[i]<9)
            {   // digits[] = {1,2,3};
                // now, digits[] = {2,3,4}
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int new_digits[] = new int[digits.length+1];
        // add one to 0th index of new array
        new_digits[0] = 1;
        return new_digits;
    }
}

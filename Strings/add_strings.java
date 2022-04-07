// Strings : Add two strings
// Built-in library - BigInteger approach 
// Though it is suggested not to use built-in library
// This approach is added for better understanding of BigInteger
// https://leetcode.com/problems/add-strings/

import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
        
        //One approach to solve the problem - built-in library
        BigInteger no1 = new BigInteger(num1);
        BigInteger no2 = new BigInteger(num2);
        
        // Perform addition and store in another number
        BigInteger ans = no1.add(no2);
        
        // return the string
        return String.valueOf(ans);
        
    }
}

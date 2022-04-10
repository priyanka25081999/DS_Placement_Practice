// Strings : Multiply two strings
// https://leetcode.com/problems/multiply-strings/

// BigInteger - built-in library approach
import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        // Convert the strings into integer
        BigInteger no1 = new BigInteger(num1);
        BigInteger no2 = new BigInteger(num2);
      
        // multiply them
        BigInteger ans = no1.multiply(no2);
        
        // return the result in String type
        return String.valueOf(ans);
    }
}


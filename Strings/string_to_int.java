// String : String to Integer (atoi)
// Leetcode : https://leetcode.com/problems/string-to-integer-atoi/
// Approach - Simple and optimized approach
// Time complexity : O(N)
// Space complexity : O(1)

/* Few things:

Examples/Testcases:
1. "42"
2. "   -42"
3. "4193 in words"
4. "words and 428"
5. "-91283472332"

1. 1st testcase. We have Given a string with numerical values & we will simply return in Integral value and return 42.
2. 2nd testcase. First we see we have some space "and it's clearly mentioned in question, we need to discard whitespace", 
then we takecare of sign & use sign as it is & finally use numerical value return -42.
3. rd testcase. We look for whitespace, but we dont have it. Then we will see wether it have a sign or not. 
Then we will see wether the 1st value numerical or not. So, we found it is and simply go for 4193, again we will check after this numerical value 
do we have more numerical value & states No. then we simply return 4193
4. 4th testcase. We see that it dont have whitespace, dont have any sign. And very first sequence is non-numerical and simply return 0
5. 5th testcase. We clearly see that no is out of range, we simply return -2^31.

*/

class Solution {
    public int myAtoi(String s) {
        // base case
        if(s.equals(""))
            return 0;
        
        int res=0, i=0, sign=1;
        
        // ignore all leading whitespaces
        while(i<s.length() && s.charAt(i) == ' ')
            i++;
        
        // check the sign
        if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if(s.charAt(i++) == '-')
                sign = -1;
        }
        
        //System.out.println("i="+i);
        
        // start iteration
        while(i<s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            // check for out of range situation
            if(res > Integer.MAX_VALUE /10 || (res == Integer.MAX_VALUE/10 && s.charAt(i) - '0' > 7)) {
                if(sign == -1)
                    return Integer.MIN_VALUE;
                
                return Integer.MAX_VALUE;
            }
            
            res = res * 10 + (s.charAt(i++) - '0');
        }
        
        return sign * res;
    }
}

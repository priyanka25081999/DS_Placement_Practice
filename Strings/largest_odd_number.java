// String : Largest odd number in a string
// Leetcode : https://leetcode.com/problems/largest-odd-number-in-string/
// Approach-1 : Simple approach
// Time complexity : O(N)
// Space complexity : O(1)

class Solution {
    public String largestOddNumber(String num) {
        
        for(int i=num.length()-1; i>=0; i--)
        {
            // Take a single char and convert it into the int
            System.out.println("no="+num);
            char ch = num.charAt(i);
            int no = ch - '0';
            
            // check if the no is odd or even
            // if odd then append it into the result string
            if(no%2!=0)
                return num.substring(0, i+1);
        }
        
        return "";
    }
}

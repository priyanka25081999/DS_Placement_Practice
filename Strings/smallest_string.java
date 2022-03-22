// String : Smallest String with a given numeric value
// https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/
// Also, check smallest-string1.png and smallest-string2.ping images

class Solution {
    public String getSmallestString(int n, int k) {
        
        // Make a character array of 'n' length
        char res[] = new char[n];
        
        // Fill the array with 'a' initially, as it is the minimum value ('a'->1)
        // array becomes : res[] = {'a', 'a', 'a', 'a', 'a'};
        Arrays.fill(res, 'a');
        
        // Now, let's subtract the k value with n
        // Example : n=3, k=27. k = 27-3=24
        k = k-n; 
        
        while(k>0)
        {
            // check the minimum value
            // As we want the lexicographically smallest string, we need to start 
            // replacing characters from end of res array
            res[--n] += Math.min(25, k);
            
            // then again subtract the min value from k and get next min value
            k = k-Math.min(25,k);
        }
        
        // convert the string array into final string and return
        return String.valueOf(res);
    }
}

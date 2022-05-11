// String : Count Sorted Vowel Strings
// Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.
// Normal approach
// Leetcode : https://leetcode.com/problems/count-sorted-vowel-strings/

class Solution {
    public int countVowelStrings(int n) {
        int a=1, e=1, i=1, o=1, u=1;
        
        for(int k=1; k<n; k++)
        {
            o = o+u;
            i = i+o;
            e = e+i;
            a = a+e;
        }
        
        return a+e+i+o+u;
    }
}

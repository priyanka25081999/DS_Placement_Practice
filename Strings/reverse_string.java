// String : Reverse character string
// Two pointer approach
// https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        int i=0, j=s.length-1;
        
        while(i!=j && j>i)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            
            i++;
            j--;
        }
    }
}


/*

class Solution {
    public void reverseString(char[] s) {
        int j=s.length-1;
        for(int i=0; i<j; i++)
        {
            if(i!=j)
            {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;   
                j--;
            }
            else
                break;
        }
    }
}

*/

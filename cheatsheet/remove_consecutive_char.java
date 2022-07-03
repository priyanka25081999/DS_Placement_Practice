// String : Remove consecutive characters
// GFG : https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1#

class Solution{
    public String removeConsecutiveCharacter(String S){
        String ans = "";
        
        for(int i=1; i<S.length(); i++)
        {
            if(S.charAt(i-1) != S.charAt(i))
              ans = ans + S.charAt(i-1);
        }
        
        ans = ans + S.charAt(S.length()-1);
        
        return ans;
    }
}

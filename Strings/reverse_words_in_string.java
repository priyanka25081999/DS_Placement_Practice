// String : Reverse words in a String 
// Normal approach : String builder and reverse the string
// Second approach would be to use stack
// Push words into stack one by one until we get space " ".
// then pop words from stack and append them into another string
// https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {
        
        // convert into string array
        String str[] = s.split(" ");
        // str array looks like : str[]={"Let's", "take", "LeetCode", "contest"};
        StringBuilder sb;
        
        for(int i=0; i<str.length; i++)
        {
           // Convert the string 
           sb = new StringBuilder(str[i]);
            
           // reverse and convert the word into string again
           str[i] = sb.reverse().toString();
        }
        
        // Combine the reverse words from array into the string
        String reverse = "";
        for(int i=0; i<str.length; i++)
        {
            reverse = reverse + str[i] + " ";
        }
        
        // Remove the last/first extra spaces
        return reverse.trim();
    }
}

// Another approach
// Time complexity : O(N)
// Space complexity : O(N) as we are taking an extra space

class Solution {
    public String reverseWords(String s) {
        // First trim the spaces and convert multiple spaces into one
        s = s.trim().replaceAll("\\s+", " ");
        
        // then split the string from spaces
        String str[] = s.split(" ");
        String result = "";
        Stack<String> st = new Stack<>();
        
        // push strings into the stack
        for(int i=0; i<str.length; i++)
            st.push(str[i]);
        
        // pop all the strings from stack and add it into the result strings
        while(!st.empty())
            result = result + st.pop() + " ";
        
        // return except the last space, hence trim it
        return result.trim();
    }
}

// Trying two pointers approach, working for single space
// WIP - handling multiple spaces in a string
// Time complexity : O(N)
// Space complexity : O(1), we are not using extra space here

class Solution {
    public String reverseWords(String s) {
        String temp = "";
        String result = "";
        int left = 0, right = s.length()-1;
        
        while(left <= right) {
            // get the char
            char ch = s.charAt(left);
            
            if(ch != ' ') {
                temp = temp + ch;
            }
            else if (ch == ' ') {
                // if ans is empty, then directly add temp into ans
                // if (result.equals(' ')) {
                //     continue;
                // }
                if(!result.equals("")) {
                    //result = result.substring(result.length()-1, result.length());
                    //System.out.println("result= "+ result);
                    
                    
                    result = temp + " " + result;
                } else {

                    result = temp;
                    System.out.println("temp = "+ temp);
                    //result = result.substring(result.length()-1, result.length());
                    //System.out.println("result= "+ result);
                }
                
                temp = "";
            }
            
            left++;
        }
        
        // Now, let's add last word into the result string (as it is not being addded due to if condition above becomes true and loop ends)
        
        if(!temp.equals("")) {
            if(!result.equals("")) {
                result = temp + " " + result;
            }
            else {
                result = temp;
            }
        }
        
        return result;
    }
}

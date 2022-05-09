// Stack : Backspace string compare
// https://leetcode.com/problems/backspace-string-compare/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            // Push the character in stack1
            if(s.charAt(i)!='#')
                st1.push(s.charAt(i));
            else
            {
                // Pop the character if '#' comes
                if(!st1.isEmpty())
                   st1.pop();
            }
        }
        
        for(int i=0; i<t.length(); i++)
        {
            // Push the character in stack2
            if(t.charAt(i)!='#')
                st2.push(t.charAt(i));
            else
            {
                // Pop the character if '#' comes
                if(!st2.isEmpty())
                   st2.pop();
            }
        }
        
        // if both stacks are not empty then pop the element and compare
        while(!st1.isEmpty() && !st2.isEmpty())
        {   
            // if the element is not same, return false
            if(st1.pop() != st2.pop())
                return false;
        }
        
        // At the end, if both stacks are empty, return true
        // else false
        return st1.isEmpty() && st2.isEmpty();
    }
}

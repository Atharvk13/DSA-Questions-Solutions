//Valid Parentheses

import java.util.Scanner;
class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> brackets=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                brackets.push(s.charAt(i));
            }
            else if(!brackets.isEmpty() && s.charAt(i) == ')' && brackets.peek() == '(')
            {
                brackets.pop();
            }
            else if(!brackets.isEmpty() && s.charAt(i) == '}' && brackets.peek() == '{')
            {
                brackets.pop();
            }
            else if(!brackets.isEmpty() && s.charAt(i) == ']' && brackets.peek() == '[')
            {
                brackets.pop();
            }
            else
            {
                return false;
            }
        }
        return brackets.isEmpty();
    }
}
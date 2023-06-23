package stack.Easy;

import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//Youtube - https://www.youtube.com/watch?v=9kmUaXrjizQ
//Time complexity - O(n)
public class ValidParenthesis {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' && !stack.isEmpty() && (stack.peek() == '(')){
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && (stack.peek() == '{')){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && (stack.peek() == '[')){
                stack.pop();
            }
        }

        return stack.isEmpty();

    }
}

package stack.Medium;

import java.util.Stack;

//You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
//Evaluate the expression. Return an integer that represents the value of the expression.
//Youtube - https://www.youtube.com/watch?v=8VYdGvOnkl0
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                stack.push(a+b);
            }else if(s.equals("*")){
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                stack.push(a*b);
            }else if(s.equals("-")){
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                stack.push(b-a);
            }else if(s.equals("/")){
                int a = stack.peek();
                stack.pop();
                int b = stack.peek();
                stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
}
